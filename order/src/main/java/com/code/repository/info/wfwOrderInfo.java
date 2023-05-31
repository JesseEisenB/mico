package com.code.repository.info;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Description: UP up UP
 * @author: Gavin
 * @date:2022/4/3 11:45
 */


/**
 * 实体类,用于订单服务单独操作数据库用的
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orderinfo")
public class wfwOrderInfo implements Serializable {

    @Id//主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增
    @Column(name = "oid") //对应数据库字段名
    private int oid;

    @Column(name = "number")//对应数据库字段名
    private String number;

    private static final long serialVersionUID = -1L;

}
