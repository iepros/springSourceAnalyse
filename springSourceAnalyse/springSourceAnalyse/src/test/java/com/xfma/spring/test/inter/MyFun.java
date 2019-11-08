package com.xfma.spring.test.inter;

/**
 *
 * @author mxf
 * @version 1.0
 */
@FunctionalInterface
public interface MyFun {
    Integer operation(Integer num);

    default void test(){
        System.out.println(123);
    }
}
