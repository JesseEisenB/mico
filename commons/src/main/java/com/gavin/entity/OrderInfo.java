package com.gavin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description: UP up UP
 * @author: Gavin
 * @date:2022/4/3 11:45
 */


/**
 * 公共的实体类,用于服务与服务之间传递数据用的
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo implements Serializable {


    private int oid;

    private String number;

    private static final long serialVersionUID = -1L;

}
