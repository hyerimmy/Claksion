# Claksion ! 💥🚗💨 

![표지](https://github.com/Claksion/images/blob/main/%E1%84%91%E1%85%AD%E1%84%8C%E1%85%B5.png?raw=true)

### Index

- [⚡️ 프로젝트 정보](#%EF%B8%8F-프로젝트-정보)
- [🔥 작업 기간](#-작업-기간)
- [📌 프로젝트 및 기능 소개 ](#-프로젝트-및-기능-소개)
- [🌳 탐구 목표](#-탐구-목표)
- [🏕️ 아키텍처](#-아키텍처)
- [🛠️ 기술 스택](#%EF%B8%8F-기술-스택)
- [📚 프로젝트 구조](#-프로젝트-구조)
- [🦸🏻‍ 팀원 및 역할](#-팀원-및-역할)

<br/>

## ⚡️ 프로젝트 정보

- [디지털 하나로](https://hanaro.recruiter.co.kr/career/home) 2기 개발반 1차 프로젝트

<br/>

## 🔥 작업 기간

- 2024.04.26 - 2024.05.10

<br/>

## 📌 프로젝트 및 기능 소개

> Redis를 활용한 교실 소통 플랫폼

학급 내 친구들과 함께 소통할 수 있는 플랫폼, **Claksion**입니다.

- 💬 친구들의 접속 현황을 실시간으로 확인하고, 단체 채팅방으로 소통할 수 있습니다.
- 💺 빈번하게 진행하는 교실의 자리 배치를 웹에서 빠르고 간편하게 정할 수도 있습니다.
- ✅ 학급 내 투표하고 싶은 것이 있다면, 투표를 올려 결과를 확인해보세요! 익명도 가능합니다.

### ➊ 회원가입 및 소셜 로그인

| 회원가입                                                                                                                                                                |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| ![회원가입](https://github.com/Claksion/images/blob/main/01.%20%E1%84%92%E1%85%AC%E1%84%8B%E1%85%AF%E1%86%AB%E1%84%80%E1%85%A1%E1%84%8B%E1%85%B5%E1%86%B8.gif?raw=true) |
| 소셜 로그인 시, 등록되지 않은 계정일 경우 회원가입 절차가 진행됩니다.                                                                                                                            |

| 카카오 로그인                                                                                                                                                                                                |                                                                                                네이버 로그인                                                                                                 |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| ![카카오 로그인](https://github.com/Claksion/images/blob/main/02-1.%20%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%8B%E1%85%B5%E1%86%AB%20%E1%84%8F%E1%85%A1%E1%84%8F%E1%85%A1%E1%84%8B%E1%85%A9.gif?raw=true) | ![네이버 로그인](https://github.com/Claksion/images/blob/main/02-2.%20%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%8B%E1%85%B5%E1%86%AB%20%E1%84%82%E1%85%A6%E1%84%8B%E1%85%B5%E1%84%87%E1%85%A5.gif?raw=true) |
| 카카오 소셜 로그인이 가능합니다.                                                                                                                                                                                     |                                                                                           네이버 소셜 로그인이 가능합니다.                                                                                           |

### ➋ 실시간 접속 유저 리스트

| 실시간 접속 유저 리스트                                                                                                                                                                                                                |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| ![실시간 접속 유저 리스트](https://github.com/Claksion/images/blob/main/03.%20%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%8B%E1%85%B5%E1%86%AB%20%E1%84%89%E1%85%B5%E1%86%AF%E1%84%89%E1%85%B5%E1%84%80%E1%85%A1%E1%86%AB.gif?raw=true) |
| 같은 학급 내 친구들의 접속 현황이 실시간으로 반영됩니다. <br/> `👀 point. '황오복' 로그인 시 ACTIVE, 로그아웃 시 INACTIVE로 즉각 변경됩니다.`                                                                                                                            |![img.png](img.png)

### ➌ 선착순 자리 선택

| B2 자리 선택 [유저1 : ✅성공]                                                                                                                                                                                                                                                  |                                                                                                                     B2 자리 선택 [유저2 : ❌실패]                                                                                                                     |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| ![선착순 자리 선택 성공](https://github.com/Claksion/images/blob/main/04-1.%20%E1%84%8C%E1%85%A1%E1%84%85%E1%85%B5%E1%84%89%E1%85%A5%E1%86%AB%E1%84%8E%E1%85%A1%E1%86%A8%E1%84%89%E1%85%AE%E1%86%AB%20-%20%E1%84%89%E1%85%A5%E1%86%BC%E1%84%80%E1%85%A9%E1%86%BC.gif?raw=true) | ![선착순 자리 선택 실패](https://github.com/Claksion/images/blob/main/04-1.%20%E1%84%8C%E1%85%A1%E1%84%85%E1%85%B5%E1%84%89%E1%85%A5%E1%86%AB%E1%84%8E%E1%85%A1%E1%86%A8%E1%84%89%E1%85%AE%E1%86%AB%20-%20%E1%84%89%E1%85%B5%E1%86%AF%E1%84%91%E1%85%A2.gif?raw=true) |
| 빈 자리를 동시에 선택할 경우, <u>밀리초 단위로 더 빨리 선택한 유저가 성공</u>합니다.                                                                                                                                                                                                                  |

### ➍ 선착순 자리 선택 결과

| 자리 선택 결과 화면                                                                                                                                                                                                                                            | `참고` 다량의 요청 발생 시 트래픽 처리 가능                                                                                                                                                                                                                                                        |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| ![선착순 자리 선택 결과](https://github.com/Claksion/images/blob/main/07.%20%E1%84%8C%E1%85%A1%E1%84%85%E1%85%B5%E1%84%89%E1%85%A5%E1%86%AB%E1%84%8E%E1%85%A1%E1%86%A8%E1%84%89%E1%85%AE%E1%86%AB%20%E1%84%80%E1%85%A7%E1%86%AF%E1%84%80%E1%85%AA.gif?raw=true) | <img src="https://github.com/Claksion/images/blob/main/07.%20%E1%84%8C%E1%85%A1%E1%84%85%E1%85%B5%E1%84%89%E1%85%A5%E1%86%AB%E1%84%8E%E1%85%A1%E1%86%A8%E1%84%89%E1%85%AE%E1%86%AB%20%E1%84%80%E1%85%A7%E1%86%AF%E1%84%80%E1%85%AA%20%EB%8C%80%EB%9F%89.png?raw=true"  width=600> |
| 자리를 클릭하면, 해당 자리를 선택한 유저 리스트가 조회됩니다.                                                                                                                                                                                                                    | 많은 인원이 요청할 경우, 밀리단위초로 우선순위가 결정됩니다.                                                                                                                                                                                                                                                |

### ➎ 자리 배치도 초기화

| 자리 배치도 초기화 [선생님 : ✅가능]                                                                                                                                                                                                                     |                                                                                                           자리 배치도 초기화 [학생 : ❌불가능]                                                                                                            |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| ![자리 배치도 초기화 가능](https://github.com/Claksion/images/blob/main/04-2.%20%E1%84%8C%E1%85%A1%E1%84%85%E1%85%B5%20%E1%84%8E%E1%85%A9%E1%84%80%E1%85%B5%E1%84%92%E1%85%AA%20(%EC%84%A0%EC%83%9D%EB%8B%98)%20-%20%EA%B0%80%EB%8A%A5.gif?raw=true) | ![자리 배치도 초기화 불가능](https://github.com/Claksion/images/blob/main/04-2.%20%E1%84%8C%E1%85%A1%E1%84%85%E1%85%B5%20%E1%84%8E%E1%85%A9%E1%84%80%E1%85%B5%E1%84%92%E1%85%AA%20(%ED%95%99%EC%83%9D)%20-%20%EB%B6%88%EA%B0%80%EB%8A%A5.gif?raw=true) |
| 선생님만 자리 배치도 초기화가 가능하며, <u>기존의 자리 주인이 모두 초기화</u>됩니다.                                                                                                                                                                                        |                                                                                                          학생은 자리 배치도 초기화가 불가능 합니다.                                                                                                           

### ➏ 단체 채팅

| 단체 채팅 [유저1]                                                                                                                                                                                                                                                                   |                                                                                                                                  단체 채팅 [유저2]                                                                                                                                  |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| ![단체 채팅 유저1](https://github.com/Claksion/images/blob/main/05.%20%E1%84%83%E1%85%A1%E1%86%AB%E1%84%8E%E1%85%A6%E1%84%8E%E1%85%A2%E1%84%90%E1%85%B5%E1%86%BC%E1%84%87%E1%85%A1%E1%86%BC(%E1%84%92%E1%85%AA%E1%86%BC%E1%84%8B%E1%85%A9%E1%84%87%E1%85%A9%E1%86%A8).gif?raw=true) | ![단체 채팅 유저2](https://github.com/Claksion/images/blob/main/05.%20%E1%84%83%E1%85%A1%E1%86%AB%E1%84%8E%E1%85%A6%E1%84%8E%E1%85%A2%E1%84%90%E1%85%B5%E1%86%BC%E1%84%87%E1%85%A1%E1%86%BC(%E1%84%92%E1%85%AA%E1%86%BC%E1%84%92%E1%85%A8%E1%84%85%E1%85%B5%E1%86%B7).gif?raw=true) |

### ➐ 실시간 투표

| 투표 생성                                                                                                                                                                    |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| ![투표생성](https://github.com/Claksion/images/blob/main/06-1.%20%E1%84%90%E1%85%AE%E1%84%91%E1%85%AD%20%E1%84%89%E1%85%A2%E1%86%BC%E1%84%89%E1%85%A5%E1%86%BC.gif?raw=true) |
| 제목, 항목, 익명유무, 마감일 등을 설정하여 투표를 생성할 수 있습니다.                                                                                                                                |

| 투표 [유저1]                                                                                                                                                                                                                                       |                                                                                                                    투표 [유저2]                                                                                                                    |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| ![단체 채팅 유저1](https://github.com/Claksion/images/blob/main/06-2.%20%E1%84%90%E1%85%AE%E1%84%91%E1%85%AD%20%E1%84%8E%E1%85%A1%E1%86%B7%E1%84%80%E1%85%A1(%E1%84%92%E1%85%AA%E1%86%BC%E1%84%92%E1%85%A8%E1%84%85%E1%85%B5%E1%86%B7).gif?raw=true) | ![단체 채팅 유저2](https://github.com/Claksion/images/blob/main/06-2.%20%E1%84%90%E1%85%AE%E1%84%91%E1%85%AD%20%E1%84%8E%E1%85%A1%E1%86%B7%E1%84%80%E1%85%A1(%E1%84%92%E1%85%AA%E1%86%BC%E1%84%8B%E1%85%A9%E1%84%87%E1%85%A9%E1%86%A8).gif?raw=true) |
| 투표 후 실시간 투표 현황을 확인할 수 있습니다.                                                                                                                                                                                                                    |                                                                                                                                                                                                                                                |

<br/>

## 🌳 탐구 목표

> 🧙 교실 속 필요한 다양한 소통에 Redis의 장점을 활용하며 탐구

- Redis의 **Sorted Set**과 AOP의 Around를 활용해 부하를 줄인 '선착순 자리선택'기능을 개발한다.
- Redis의 **Pub/Sub 패턴**과 **Socket**을 활용해 '실시간 채팅'기능을 개발한다.
- **Redis를 Session Storage로 사용**함으로써 빠른 응답속도의 장점을 취하고, 현재 서비스에 로그인돼 있는 클라이언트 정보를 출력한다.

<br/>

## 🏕️ 아키텍처
추가예정입니다.

<br/>

## 🛠️ 기술 스택

#### Environment

<img src="https://img.shields.io/badge/intellijidea-000000?style=flat&logo=intellijidea&logoColor=white">

#### Development

<img src="https://img.shields.io/badge/Java-007396?style=flat&logo=Java&logoColor=white"> <img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=flat&logo=Spring Boot&logoColor=white"> <img src="https://img.shields.io/badge/Bootstrap-7952B3?style=flat&logo=Bootstrap&logoColor=white"> <img src="https://img.shields.io/badge/Javascript-F7DF1E?style=flat&logo=Javascript&logoColor=white">

#### DataBase

<img src="https://img.shields.io/badge/MySQL-4479A1?style=flat&logo=MySQL&logoColor=white"> <img src="https://img.shields.io/badge/Redis-DC382D?style=flat&logo=Redis&logoColor=white">

#### Communication

<img src="https://img.shields.io/badge/Slack-4A154B?style=flat&logo=Slack&logoColor=white"> <img src="https://img.shields.io/badge/Notion-000000?style=flat&logo=Notion&logoColor=white">

<br/>

## 📚 프로젝트 구조

<details>
<summary>파일트리</summary>

```
📦 
└─ src
   ├─ main
   │  ├─ java
   │  │  └─ com
   │  │     └─ claksion
   │  │        ├─ ClaksionApplication.java
   │  │        ├─ ServletInitializer.java
   │  │        ├─ app
   │  │        │  ├─ data
   │  │        │  │  ├─ dto
   │  │        │  │  │  ├─ ClassMate.java
   │  │        │  │  │  ├─ LoginUser.java
   │  │        │  │  │  ├─ OauthType.java
   │  │        │  │  │  ├─ SeatUser.java
   │  │        │  │  │  ├─ UserInfo.java
   │  │        │  │  │  ├─ enums
   │  │        │  │  │  │  └─ MessageType.java
   │  │        │  │  │  ├─ msg
   │  │        │  │  │  │  ├─ AdminMsg.java
   │  │        │  │  │  │  ├─ ChatRoom.java
   │  │        │  │  │  │  └─ Msg.java
   │  │        │  │  │  ├─ request
   │  │        │  │  │  │  ├─ ChatMessageRequest.java
   │  │        │  │  │  │  ├─ SelectSeatRequest.java
   │  │        │  │  │  │  └─ UpdateSeatUserRequest.java
   │  │        │  │  │  └─ response
   │  │        │  │  │     ├─ GetChatMessageResponse.java
   │  │        │  │  │     └─ GetSeatAndUserResponse.java
   │  │        │  │  └─ entity
   │  │        │  │     ├─ BaseEntity.java
   │  │        │  │     ├─ ClassroomEntity.java
   │  │        │  │     ├─ PollContentEntity.java
   │  │        │  │     ├─ PollEntity.java
   │  │        │  │     ├─ SeatEntity.java
   │  │        │  │     ├─ UserEntity.java
   │  │        │  │     └─ UserType.java
   │  │        │  ├─ frame
   │  │        │  │  ├─ BaseRepository.java
   │  │        │  │  └─ BaseService.java
   │  │        │  ├─ repository
   │  │        │  │  ├─ ClassroomRepository.java
   │  │        │  │  ├─ LoginUserRepository.java
   │  │        │  │  ├─ PollContentRepository.java
   │  │        │  │  ├─ PollRepository.java
   │  │        │  │  ├─ SeatRepository.java
   │  │        │  │  └─ UserRepository.java
   │  │        │  └─ service
   │  │        │     ├─ ClassroomService.java
   │  │        │     ├─ PollContentService.java
   │  │        │     ├─ PollService.java
   │  │        │     ├─ RankingService.java
   │  │        │     ├─ RedisMessageSubscriber.java
   │  │        │     ├─ SeatSelectService.java
   │  │        │     ├─ SeatService.java
   │  │        │     ├─ UserService.java
   │  │        │     ├─ WebSocketHandler.java
   │  │        │     ├─ aop
   │  │        │     │  ├─ AroundValidSeatOnRedis.java
   │  │        │     │  └─ SeatValidAop.java
   │  │        │     ├─ chat
   │  │        │     │  ├─ ChatRoomRepository.java
   │  │        │     │  ├─ MessageService.java
   │  │        │     │  ├─ RedisMessageStorage.java
   │  │        │     │  ├─ RedisPublisher.java
   │  │        │     │  ├─ RedisService.java
   │  │        │     │  └─ RedisSubscriber.java
   │  │        │     └─ oauth
   │  │        │        ├─ KakaoService.java
   │  │        │        └─ NaverService.java
   │  │        ├─ config
   │  │        │  ├─ JasyptConfig.java
   │  │        │  ├─ RedisConfig.java
   │  │        │  ├─ SecurityConfig.java
   │  │        │  └─ StomWebSocketConfig.java
   │  │        └─ controller
   │  │           ├─ ChatController.java
   │  │           ├─ ChatRoomController.java
   │  │           ├─ MainController.java
   │  │           ├─ MessageController.java
   │  │           ├─ PollController.java
   │  │           ├─ RedisController.java
   │  │           ├─ SeatController.java
   │  │           ├─ SeatRestController.java
   │  │           ├─ UserController.java
   │  │           └─ UserRestController.java
   │  ├─ resources
   │  │  ├─ application-aws.yml
   │  │  ├─ application-dev.yml
   │  │  ├─ application.yml
   │  │  ├─ log4jdbc.log4j2
   │  │  ├─ logback.properties
   │  │  ├─ mapper
   │  │  │  ├─ classroommapper.xml
   │  │  │  ├─ pollcontentmapper.xml
   │  │  │  ├─ pollmapper.xml
   │  │  │  ├─ seatmapper.xml
   │  │  │  └─ usermapper.xml
   │  └─ webapp
   │     └─ views
   │        ├─ chat.jsp
   │        ├─ chat
   │        │  ├─ room.jsp
   │        │  └─ roomdetail.jsp
   │        ├─ chatTest.jsp
   │        ├─ home.jsp
   │        ├─ index.jsp
   │        ├─ login.jsp
   │        ├─ loginother.jsp
   │        ├─ poll_creation.jsp
   │        ├─ poll_final_result.jsp
   │        ├─ poll_form.jsp
   │        ├─ poll_list.jsp
   │        ├─ poll_result.jsp
   │        ├─ register.jsp
   │        ├─ reservation.jsp
   │        ├─ seat.jsp
   │        ├─ seat_result.jsp
   │        └─ seat_select.jsp
```

</details>


<br/>

## 🦸🏻‍ 팀원 및 역할

|                                                        **김하영**                                                         |                                                         **한원희**                                                         |                                                        **황혜림**                                                        |
|:----------------------------------------------------------------------------------------------------------------------:|:-----------------------------------------------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------------:|
| [<img src="https://avatars.githubusercontent.com/u/90179774?v=4"  height=150 width=150> ](https://github.com/yhkkkkxx) | [<img src="https://avatars.githubusercontent.com/u/91041488?v=4"  height=150 width=150>](https://github.com/Wonhee0221) | [<img src="https://avatars.githubusercontent.com/u/70644449?v=4"  height=150 width=150>](https://github.com/hyerimmy) |
|                                                           투표 순위 및 투표 유저 관리<br/>실시간 투표 현황                                                            |                                                            Websocket, Stomp, Redis Pub/Sub<br/>실시간 채팅 구현<br/>   Redis 세션관리                                                         |                            소셜 로그인 및 Redis 세션 관리<br/>Redis, SSE 실시간 접속 유저 현황<br/>Redis 자리 선착순 선택 및 결과 확인                            |

