package spring.playground.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderControllerV0 {
    private final OrderServiceV0 orderService;
    @GetMapping("/v0/request")
    public String request(@RequestParam(value="itemId") String itemId) {
        System.out.println("/v0/request request start, itemId: " + itemId);
        orderService.orderItem(itemId);
        return "ok";
    }
}