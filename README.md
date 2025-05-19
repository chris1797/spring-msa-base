## 목표 아키텍처 (Eureka + Kafka 기반)

---

## 구성 서비스

| 서비스 이름               | 역할                  | 비고                   |
|----------------------|---------------------|----------------------|
| gateway-service      | 외부 진입점(API Gateway) | Spring Cloud Gateway |
| discovery-service    | 서비스 등록 및 탐색         | Spring Cloud Eureka  |
| order-service        | 주문 생성 및 조회          | Kafka Producer       |
| payment-service      | 결제 처리               | Kafka Consumer       |
| notification-service | 알림 전송 (결제 성공 시)     | Kafka Consumer       |
| config-service (선택)  | 설정 중앙화 관리           | Spring Cloud Config  |


## 구현 순서

1. `discovery-service` (Eureka 서버 만들기)
2. `order-service`, `payment-service` 등 비즈니스 서비스 등록
3. `gateway-service` 에서 라우팅
4. 이후에 Kafka로 이벤트 기반 통신 붙이기