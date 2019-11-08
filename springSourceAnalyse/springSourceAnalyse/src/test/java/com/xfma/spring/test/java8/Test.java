package com.xfma.spring.test.java8;

import com.xfma.spring.test.entity.Student;
import com.xfma.spring.test.inter.MyFun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 *
 * @author mxf
 * @version 1.0
 */
public class Test {

    List<Student> students = Arrays.asList(
            new Student("小白",12),
            new Student("小黑",15),
            new Student("小王",18),
            new Student("小李",23)
    );

    @org.junit.Test
    public void test1(){
        students.stream().map(Student :: getStudentName).forEach(System.out::println);
    }

    /**
     * Consumer  消费型接口 一个方法  有参数   无返回值
     * Function  函数式接口，有一个方法，有参数，有返回值
     */
    @org.junit.Test
    public void test2(){
        System.out.println(operation(100, num -> num * 2));
    }

    public Integer operation(Integer num, Function<Integer,Integer> function){
        return function.apply(num);
    }

    /**
     * 产生十个随机数
     * Supplier 供给型接口 有一个无参方法，有一个返回值
     */
    @org.junit.Test
    public void test3(){
        getNums(10,() ->(int)(Math.random() * 100))//产生十个数字
                .forEach(e -> System.out.println(e));//遍历这十个数
    }

    public List<Integer> getNums(int num, Supplier<Integer> supplier){
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<num;i++){
            list.add(supplier.get());
        }

        return list;
    }
}
