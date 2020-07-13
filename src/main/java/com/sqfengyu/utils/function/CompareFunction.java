package com.sqfengyu.utils.function;
import com.sun.istack.internal.NotNull;
/**
 * @author SQfengyu
 * @version 1.0
 * @date 2020/7/13
 * @description
 */

@FunctionalInterface
public interface CompareFunction<T> {

    /**
     * compare with t1 t2
     * @param t1
     * @param t2
     * @return
     */
    T compare(@NotNull T t1, @NotNull T t2);
}
