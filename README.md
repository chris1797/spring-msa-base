## 목표 아키텍처 (Eureka + Kafka 기반)

---

## 구성 서비스

| 서비스 이름           | 역할                     | 비고                  |
|-----------------------|--------------------------|-----------------------|
| gateway-service      | 외부 진입점(API Gateway) | Spring Cloud Gateway |
| discovery-service    | 서비스 등록 및 탐색      | Spring Cloud Eureka  |
| order-service        | 주문 생성 및 조회        | Kafka Producer       |
| payment-service      | 결제 처리                | Kafka Consumer       |
| notification-service | 알림 전송 (결제 성공 시) | Kafka Consumer       |
| config-service (선택) | 설정 중앙화 관리         | Spring Cloud Config  |