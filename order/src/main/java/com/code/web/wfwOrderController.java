package com.code.web;

import com.code.service.OrderService;
import com.gavin.entity.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: UP up UP
 * @author: Gavin
 * @date:2022/4/4 16:58
 */

@RestController
@CrossOrigin
@RequestMapping("/order")
public class wfwOrderController {
@Autowired
private OrderService orderService;

@RequestMapping("/add")
public String addOrder(OrderInfo orderInfo){

    int order = orderService.createOrder(orderInfo);

    return String.valueOf(order);
}

}
