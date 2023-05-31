package com.code.repository;

import com.code.OrderApplication;
import com.code.service.impl.OrderServiceImpl;
import com.gavin.entity.OrderInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest(classes = OrderApplication.class)
public class OrderApplicationTests {
  /* @Autowired
    private OrderService orderService;
*/
    @Test
    void Test01() {
        OrderServiceImpl orderService = new OrderServiceImpl();
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setNumber("100089");
        int order = orderService.createOrder(orderInfo);
        System.out.println(orderInfo);
        System.out.println(order);

    }

}
