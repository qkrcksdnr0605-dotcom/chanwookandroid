package com.example.kg

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kg.ui.theme.KgTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KgTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BmiApp()
                }
            }
        }
    }
}

@Composable
fun BmiApp(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier.fillMaxSize()
    ) { innerPadding ->
        BmiScreen(
            modifier = Modifier
                .padding(innerPadding)
                .padding(24.dp)
        )
    }
}

@Composable
fun BmiScreen(modifier: Modifier = Modifier) {
    // 입력 값 / 결과를 화면 회전해도 유지되게 rememberSaveable 사용
    var heightInput by rememberSaveable { mutableStateOf("") }   // cm
    var weightInput by rememberSaveable { mutableStateOf("") }   // kg
    var bmiText by rememberSaveable { mutableStateOf("") }
    var statusText by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "BMI 계산기",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = heightInput,
            onValueChange = { heightInput = it },
            label = { Text("키 (cm)") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = weightInput,
            onValueChange = { weightInput = it },
            label = { Text("몸무게 (kg)") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                val h = heightInput.toFloatOrNull()
                val w = weightInput.toFloatOrNull()

                if (h != null && w != null && h > 0f && w > 0f) {
                    val heightMeter = h / 100f
                    val bmi = w / (heightMeter * heightMeter)

                    bmiText = String.format("%.1f", bmi)

                    statusText = when {
                        bmi < 18.5f -> "저체중"
                        bmi < 23f -> "정상"
                        bmi < 25f -> "과체중"
                        else -> "비만"
                    }
                } else {
                    bmiText = ""
                    statusText = "키와 몸무게를 숫자로 제대로 입력하세요."
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("BMI 계산하기")
        }

        Spacer(modifier = Modifier.height(24.dp))

        if (statusText.isNotEmpty()) {
            if (bmiText.isNotEmpty()) {
                Text(
                    text = "당신의 BMI : $bmiText",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
            Text(
                text = statusText,
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BmiPreview() {
    KgTheme {
        BmiApp()
    }
}
