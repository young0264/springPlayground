package spring.playground.proxy.app.v1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderControllerV1Impl2 implements OrderControllerV1 {

    private final OrderServiceV1 orderServiceV1;

    public OrderControllerV1Impl2(OrderServiceV1 orderServiceV1) {
        this.orderServiceV1 = orderServiceV1;
    }

    @Override
    public String request(String itemId) {
        System.out.println("OrderControllerV1Impl2 start");
        orderServiceV1.orderItem(itemId);
        return "ok";
    }

    @Override
    public String noLog() {
        return "ok";
    }

}
