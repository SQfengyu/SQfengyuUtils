package com.sqfengyu.utils.fctools;

import com.sqfengyu.utils.function.CompareFunction;

/**
 * @author SQfengyu
 * @version 1.0
 * @date 2020/7/13
 * @description
 */
public class CompareToTool {

    /**
     * compare two tos
     * @param t1
     * @param t2
     * @param compareFunction
     * @return
     */
    public  static <T> T compareTo(T t1, T t2, CompareFunction<T> compareFunction){
        if (null == t1 || null == t2){
            return null;
        }
        return compareFunction.compare(t1,t2);
    }
}
