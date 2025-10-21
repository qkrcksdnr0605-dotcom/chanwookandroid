package com.example.w05

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.w05.ui.theme.Compose_202511016Theme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose_202511016Theme {
                val count = remember { mutableStateOf(0) }
                Column(
                    modifier = Modifier.fillMaxSize().padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    CounterApp(count)
                    Spacer(modifier = Modifier.height(32.dp))
                    StopWatchApp()


                }
            }
        }
    }
}


@Composable
fun CounterApp(count: MutableState<Int>) {
    // TODO: 상태 변수 정의
    // TODO: 버튼 클릭 시 상태 변경 로직 작성
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Count: ${count.value}",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        ) // TODO: 상태값 표시
        Row {
            Button(onClick = { count.value++ }) {
                Text("Increase")
            }
            Button(onClick = { count.value=0 }) {
                Text("Reset")
            }
        }
    }
}

@Composable
fun StopWatchApp() {
    var timeInMillis by remember { mutableStateOf(1234L) }
    var isRunning by remember { mutableStateOf(false) }
    // 1. isRunning 상태가 true일 때만 실행되는 LaunchedEffect 추가
    LaunchedEffect(isRunning) {
        if (isRunning) {
            while (true) {
                delay(10L) // 10밀리초마다
                timeInMillis += 10L // 시간을 10밀리초씩 증가
            }
        }
    }

    // TODO: 시작, 중지, 리셋 버튼과 시간 표시 로직 작성
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "00:00",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        ) // TODO: 시간 표시
        Row {
            Button(onClick = { isRunning=true }) { Text("Start") }
            Button(onClick = { isRunning=false }) { Text("Stop") }
            Button(onClick = {
                isRunning = false
                timeInMillis = 0L
            }) { Text("Reset") }
        }
    }
}
// 시간을 MM:SS:ss 형식으로 변환하는 헬퍼 함수
private fun formatTime(timeInMillis: Long): String {
    val minutes = (timeInMillis / 1000) / 60
    val seconds = (timeInMillis / 1000) % 60
    val millis = (timeInMillis % 1000) / 10
    return String.format("%02d:%02d:%02d", minutes, seconds, millis)
}
@Preview(showBackground = true)
@Composable
fun CounterAppPreview() {
    val count = remember { mutableStateOf(0) }
    CounterApp(count)
}

@Preview(showBackground = true)
@Composable
fun StopWatchPreview() {
    StopWatchApp()
}
