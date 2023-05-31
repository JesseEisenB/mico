package com.gavin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description: UP up UP
 * @author: Gavin
 * @date:2022/4/4 9:48
 */

/**
 * 公共的实体类,用于服务与服务之间传递数据用的
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsInfo implements Serializable {

    private int id;

    private String name;

    private static final long serialVersionUID = -6849794470754667710L;


}
