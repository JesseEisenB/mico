package com.code.service.impl;

import com.code.repository.OrderRepository;
import com.code.repository.info.wfwOrderInfo;
import com.code.service.OrderService;
import com.gavin.entity.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: UP up UP
 * @author: Gavin
 * @date:2022/4/4 9:52
 */


@Service
//暴露的服务,让别人去调用
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    //创建订单 ,传进来的是commons中的实体类
    @Override
    public int createOrder(OrderInfo orderInfo) {
//而操作数据库用的是 order模块里的实体类,所以需要转化一下
       wfwOrderInfo wfwOrderInfo = new wfwOrderInfo();
        wfwOrderInfo.setNumber(orderInfo.getNumber());
        int oid=-1;
        try{
            //接口调用失败,处理
            oid = orderRepository.save(wfwOrderInfo).getOid();
        }catch(Exception e) {
            System.out.println(e);
            return -1;
        }
       return oid;


    }


}
