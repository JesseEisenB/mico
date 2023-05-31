package com.code.controller;

import com.gavin.entity.OrderInfo;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: UP up UP
 * @author: Gavin
 * @date:2022/4/4 16:54
 */
@RestController
public class OrderController {


    public String addOrder(OrderInfo orderInfo) {
        return "1";
    }

}
