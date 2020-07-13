package com.sqfengyu.utils.to;

import lombok.Data;
import lombok.ToString;

/**
 * @author SQfengyu
 * @version 1.0
 * @date 2020/7/13
 * @description
 */

@Data
@ToString
public class TestTo {

    /**
     * primary
     */
    private Integer id;

    /**
     * attribute
     */
    private String name;

    public TestTo(Integer id, String name){
        this.id = id;
        this.name = name;
    }
}
