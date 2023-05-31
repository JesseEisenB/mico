package com.code.repository;

import com.code.repository.info.wfwOrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description: UP up UP
 * @author: Gavin
 * @date:2022/4/4 15:55
 */


//使用了jpa,自动生成并注入bean
public interface OrderRepository extends JpaRepository<wfwOrderInfo,Integer> {


}
