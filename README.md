🧋 3주차 — Compose Coffee

Jetpack Compose 기본 다루기

Column, Row, Box 등 Compose 레이아웃을 활용해 UI 구조를 직접 설계

버튼·이미지·텍스트를 조합해 하나의 커피 주문 화면 완성

<img width="132" height="190" alt="image" src="https://github.com/user-attachments/assets/471771a7-7f5a-4874-90db-3f442ed9f19c" />


Material3 디자인 시스템의 색상·테마 적용 실습 ☕ 결과: “Compose Coffee” 앱 완성 — 컴포즈 문법과 UI 흐름을 익히는 첫 단계

👤 4주차 — 프로필 카드 만들기 (Layout 예제 app_03)

주제: Jetpack Compose의 레이아웃 시스템을 활용한 프로필 UI 구성

<img width="303" height="87" alt="image" src="https://github.com/user-attachments/assets/7e2ff4e1-8013-41c1-a2a2-4e2c03980bab" />

핵심 포인트

Card, Row, Column을 조합하여 하나의 프로필 카드 생성

Image를 CircleShape로 잘라내고, RoundedCornerShape 카드 디자인 적용

Material3의 색상·글꼴·패딩 등 기본 디자인 시스템 활용

Kotlin 코드만으로 완전한 UI를 선언적으로 구현

⏱️ 5주차 — 스톱워치 앱

상태 제어와 시간 측정 로직 구현

remember와 LaunchedEffect를 활용한 Compose 상태관리

시작(Start), 정지(Stop), 리셋(Reset) 기능 추가

<img width="339" height="339" alt="image" src="https://github.com/user-attachments/assets/3fdc9276-c7a6-40e3-92e6-4dca015e3141" />


시간 흐름을 밀리초 단위로 표시하는 로직 구현

UI는 간결하게, 기능은 정확하게 — 작은 프로젝트지만 구조 설계 연습에 도움이 됨 🕒 결과: Compose로 동작하는 실시간 타이머 완성

🎮 6주차 — 버블버블 게임

터치 이벤트 & 애니메이션 실습

Canvas와 BoxWithConstraints를 사용해 게임 영역 구성

LaunchedEffect로 버블 생성·이동·삭제 로직 구현

<img width="362" height="819" alt="image" src="https://github.com/user-attachments/assets/2623e5e4-ba9b-4356-8d47-2d819ab9f601" />


clickable을 이용해 터치로 버블을 제거하는 이벤트 처리

점수·남은 시간·하이스코어 시스템 추가

버블 색상, 배경 톤, 애니메이션 속도 등 시각적 요소 개선 ✨ 결과: 터치 반응형 미니 게임 완성 — Compose에서의 인터랙션 이해

📘 정리 요약 주차 주제 핵심 포인트 3주차 Compose Coffee 기본 UI 구성과 컴포즈 레이아웃 익히기 4주차 레이아웃 시스템을 이용한 ui 구성 5주차 스톱워치 상태 관리와 시간 로직, 타이머 기능 6주차 버블버블 터치 이벤트, 애니메이션, 게임 로직 구현

📌 Repository 관리 중 앞으로 진행되는 주차별 실습(예: To-Do App, 간단한 DB 연결 등)도

🎮 7주차 — 클릭 게임(초판 버전)

기본적인 클릭 시 점수 증가 기능을 가진 가장 단순한 형태의 게임 제작.

<img width="143" height="313" alt="1주차" src="https://github.com/user-attachments/assets/7fbc0c62-6554-4c19-a010-9a3b540ad487" />
핵심 포인트

remember + mutableStateOf → 실시간 점수 상태 관리

버튼 클릭 이벤트 처리

UI 레이아웃: Column / Box 구조 연습

간단한 게임 로직 설계 경험

✨ 결과: 상태 관리(State) 개념을 자연스럽게 이해한 주차

🍽️ 8주차 — 음식 추천 앱 (Random Food Selector)

원하는 음식이 없을 때 랜덤 추천해주는 미니 앱 구현.
<img width="166" height="366" alt="음식1" src="https://github.com/user-attachments/assets/045ff027-2c1b-4c50-bf79-c97d88c2c6b6" />

<img width="166" height="364" alt="음식2" src="https://github.com/user-attachments/assets/29ce1227-1a52-4553-9f41-8d79dd11c768" />

핵심 포인트

음식 리스트에서 랜덤 선택

Button 클릭 → 상태 변경 → UI 자동 업데이트

Card 디자인 + 간단한 Material 요소 적용

짧고 직관적인 기능으로 Compose 이해도 상승

✨ 결과: State → UI 흐름을 완전히 이해한 주차

🧮 9주차 — 비만도 계산기 (BMI Calculator)

키와 몸무게를 입력받아 비만 여부를 알려주는 유틸리티 앱.

<img width="155" height="247" alt="비만2" src="https://github.com/user-attachments/assets/f903cf97-bd0d-48ce-a952-0f2d0e114e3d" />
<img width="161" height="252" alt="비만1" src="https://github.com/user-attachments/assets/6e35f726-b3f2-4d72-88a5-f1d2d5f13f63" />

핵심 포인트

TextField로 입력 처리

BMI 공식 적용해 계산

조건에 따라 결과 색상·문구 변경

Form 스타일 Compose 구성

✨ 결과: 사용자 입력 처리 + 계산 로직 + 조건부 UI 경험


🛒 10주차 — 페이크 스토어(Fake Store API) 앱

Fake Store REST API를 사용하여 상품 데이터를 불러오고 리스트 형태로 출력하는 앱 구현.

<img width="176" height="385" alt="굿즈" src="https://github.com/user-attachments/assets/be4fecef-7f5c-414d-b720-b81235389bf6" />


핵심 포인트

Retrofit + Coroutine 기반 API 통신

JSON → Kotlin 데이터 클래스 파싱

LazyColumn으로 상품 목록 UI 구성

이미지, 제목, 가격, 설명 표시

Material3 Card 디자인 적용

✨ 결과: 외부 API 데이터 활용 + Compose UI 렌더링까지 완성


🎮 11주차 — 풍선 더블클릭 게임 (업그레이드 버전 / 최종 프로젝트)

이번 주차에서는 이전의 단순 클릭게임을 완전히 업그레이드한 새로운 버전을 제작했다.
게임 구조, 점수 로직, UI 반응성, 애니메이션, 랭킹 시스템까지 구현하며
실제 미니게임 형태에 가까운 완성도를 목표로 했다.

<img width="131" height="293" alt="더블클릭" src="https://github.com/user-attachments/assets/77149d2d-d615-4551-9dc0-7be866aab52c" />

🧩 프로젝트 개요

기존의 “클릭하면 점수가 증가하는 단순 게임”을 넘어,
더블클릭 판정 기반의 콤보 시스템과
제한시간 플레이,
랭킹 저장 기능,
이미지 클릭 애니메이션(풍선 터지는 느낌) 등
“게임 다운 기능”들을 대폭 추가했다.

단순 UI 실습을 넘어서 Compose로 게임 로직을 구현하는 경험을 제공한 고급 실습 주차였다.

🏗️ 핵심 기능 상세 소개
1️⃣ 더블클릭 판정 시스템 (Double-Tap Detection)

이 프로젝트의 핵심 로직.

200ms 안에 두 번 클릭 → 콤보 증가

단일 클릭 → 콤보 초기화

빠르게 두 번 터치해야 하므로,
사용자 반응 속도에 따라 점수가 크게 달라지는 구조

val diff = now - lastClickTime

if (diff in 1..200) {
    combo += 1
    score += 10 + (combo * 5)
} else {
    combo = 0
    score += 5
}

✔ 구현 포인트

diff 계산을 이용한 심플하지만 강력한 로직

모바일 반응속도 게임에서 실제 사용하는 방식

단순 클릭 게임에서 “스킬 기반 게임”으로 변신

2️⃣ 제한시간 30초 타이머

게임 진행을 30초로 제한하여
긴장감 + 반복 플레이 요소를 강화했다.

LaunchedEffect(isRunning) {
    while (timeLeft > 0) {
        delay(1000)
        timeLeft--
    }
}

✔ 특징

시간이 0이 되면 자동 종료

시간이 줄어드는 UI가 플레이 몰입감을 높임

Compose의 LaunchedEffect를 자연스럽게 활용하는 대표 예제

3️⃣ 점수 & 콤보 시스템
✔ 단일 클릭

+5점

콤보 초기화

판정 메시지: “🙂 단일 클릭 +5”

✔ 더블클릭 성공

10 + (콤보 × 5)

판정 메시지: “🔥 더블클릭 콤보!”

콤보가 올라갈수록 점수가 기하급수적으로 상승해
더블클릭 정확도와 속도가 높은 플레이어가 높은 점수를 확보하는 구조.

4️⃣ 풍선 클릭 애니메이션

풍선을 클릭할 때마다 작게 튀어 오르는(scale) 효과를 추가하여
손맛을 강화했다.

val clickScale by animateFloatAsState(
    targetValue = if (clicked) 1.12f else 1f,
    animationSpec = tween(120)
)


✔ 풍선이 '톡' 튀는 느낌이 들어 실제로 게임을 최소 2배 더 재밌게 만드는 요소
✔ Compose 애니메이션 API 사용법을 자연스럽게 익힘

5️⃣ 점수 저장 및 랭킹 기능 (Top 5)

한 번의 플레이가 끝나면 점수를 랭킹 리스트에 저장할 수 있다.

플레이 횟수 자동 카운트 (플레이1, 플레이2 …)

최고 점수 순 정렬

상위 5개만 유지하여 깔끔한 랭킹 관리

rankEntries = (rankEntries + newScore)
    .sortedByDescending { it.score }
    .take(5)


✔ 게임 반복성 증가
✔ 간단한 자료구조 + 정렬 로직 학습 효과

6️⃣ 전체 UI 구성
화면 구성은 크게 3부분이다:
🔼 상단 영역

게임 제목

남은 시간

점수 / 콤보 / 판정 메시지

🎈 중앙 영역

풍선 이미지

클릭 애니메이션 + 이벤트 처리 핵심 영역

🔽 하단 영역

점수 저장 버튼

다시 시작 버튼

랭킹 리스트

UI가 명확히 역할 분담이 되어 있어 유지보수 쉬움

🧠 기술적으로 배운 점

이 버전에서 다룬 개념들은 Compose를 활용한 앱 개발 중 상급 난이도 주제들이다:

정밀 입력 이벤트 처리 (Double-Tap)

타이머 기반 게임 로직

State 변화 기반의 실시간 UI 업데이트

애니메이션 적용

리스트 정렬 및 데이터 관리

게임 루프 설계

게임을 만들었지만, 실은 앱 개발의 핵심 패턴을 모두 경험한 주차였다.
