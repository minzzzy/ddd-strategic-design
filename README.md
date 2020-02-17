# ddd-strategic-design

## 요구 사항

### 상품

* 상품을 등록할 수 있다.
* 상품의 가격이 올바르지 않으면 등록할 수 없다.
    * 상품의 가격은 0 원 이상이어야 한다.
* 상품의 목록을 조회할 수 있다.

### 메뉴 그룹

* 메뉴 그룹을 등록할 수 있다.
* 메뉴 그룹의 목록을 조회할 수 있다.

### 메뉴

* 1 개 이상의 등록된 상품으로 메뉴를 등록할 수 있다.
* 메뉴의 가격이 올바르지 않으면 등록할 수 없다.
    * 메뉴의 가격은 0 원 이상이어야 한다.
    * 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
* 메뉴는 특정 메뉴 그룹에 속해야 한다.
* 메뉴의 목록을 조회할 수 있다.

### 테이블

* 테이블을 등록할 수 있다.
* 테이블의 목록을 조회할 수 있다.
* 빈 테이블 설정 또는 해지할 수 있다.
* 단체 지정된 테이블은 빈 테이블 설정 또는 해지할 수 없다.
* 주문 상태가 조리 또는 식사인 테이블은 빈 테이블 설정 또는 해지할 수 없다.
* 방문한 손님 수를 입력할 수 있다.
* 방문한 손님 수가 올바르지 않으면 입력할 수 없다.
    * 방문한 손님 수는 0 명 이상이어야 한다.
* 빈 테이블은 방문한 손님 수를 입력할 수 없다.

### 단체 지정

* 2 개 이상의 빈 테이블을 단체로 지정할 수 있다.
* 단체 지정은 중복될 수 없다.
* 단체 지정을 해지할 수 있다.
* 단체 지정된 테이블의 주문 상태가 조리 또는 식사인 경우 단체 지정을 해지할 수 없다.

### 주문

* 1 개 이상의 등록된 메뉴로 주문을 등록할 수 있다.
* 빈 테이블에는 주문을 등록할 수 없다.
* 주문의 목록을 조회할 수 있다.
* 주문 상태를 변경할 수 있다.
* 주문 상태가 계산 완료인 경우 변경할 수 없다.

## 용어 사전

| 한글명 | 영문명 | 설명 |
| --- | --- | --- |
| 상품 | Product | 이름과 가격을 갖고 있으며 메뉴에 포함될 수 있는 제품을 뜻한다. |
| 메뉴 | Menu | 이름과 가격을 갖고 있으며 손님이 주문할 수 있는 단위로 하나의 메뉴 그룹 속한다. |
| 메뉴의 상품 | Menu Product | 하나의 메뉴에 매핑되는 상품의 정보와 수량을 갖고 있다. |
| 메뉴 그룹 | Menu Group | 메뉴의 묶음으로 하나 이상의 메뉴를 포함한다. |
| 주문 | Order | 손님의 주문 내역으로 테이블 정보, 주문의 상태, 주문 씨간, 주문된 메뉴 정보를 포함한다. |
| 주문 상태 | Order Status | 주문의 상태를 표현한 것으로 요리중, 식사중, 식사 완료 상태가 있다. |
| 요리 중 상태 | COOKING | 손님에게 처음 주문을 받으면 요리 중인 상태이다. |
| 식사 중 상태 | MEAL | 손님이 식사가 제공된 상태  |
| 식사 완료 상태 | COMPLETION | 손님의 식사가 완료된 상태 |
| 주문된 메뉴 정보 | Order Line Item | 손님이 주문한 메뉴의 정보와 수량을 갖고 있다. |
| 테이블 | Table | 손님이 앉아서 주문을 할 수 있는 곳을 뜻한다. 손님의 수와 비어있는지 여부를 알 수 있다. | 
| 단체 지정 | TableGroup | 테이블을 2개이상 지정해서 단체로 묶을 수 있다. | 
| 손님 | Guest | 테이블에 앉아 메뉴를 고르고 주문을 할 수 있는 주체 | 

## 모델링
