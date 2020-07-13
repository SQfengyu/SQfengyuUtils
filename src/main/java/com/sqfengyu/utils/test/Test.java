package com.sqfengyu.utils.test;

import com.sqfengyu.utils.fctools.CompareToTool;
import com.sqfengyu.utils.to.TestTo;

/**
 * @author SQfengyu
 * @version 1.0
 * @date 2020/7/13
 * @description
 */
public class Test {


    public static void main(String[] args) {

        TestTo a = new TestTo(1, "a");
        TestTo b = new TestTo(2, "b");
        System.out.println(CompareToTool.compareTo(a, b, (x,y) ->{
            if(a.getId().compareTo(b.getId()) > 0){
                return a;
            }
            return b;
        }).getId());
    }
}
