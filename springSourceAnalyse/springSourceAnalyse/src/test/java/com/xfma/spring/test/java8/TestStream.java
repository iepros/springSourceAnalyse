package com.xfma.spring.test.java8;

import com.xfma.spring.test.entity.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Java8流测试
 *
 * @author mxf
 * @version 1.0
 */
public class TestStream {

    List<Student> students = Arrays.asList(
            new Student("小白",12),
            new Student("小黑",15),
            new Student("小王",12),
            new Student("小李",23)
    );

    /**
     * 创建流的三种方式
     */
    @Test
    public void test1(){

        List<String> list = new ArrayList<>();
        //1.通过集合创建
        Stream<String> stream1 = list.stream();

        //并行流
        Stream<String> stream2 = list.parallelStream();

        Student[] students = new Student[10];
        //2.通过Arrays创建
        Stream<Student> stream3 = Arrays.stream(students);
        //3.通过Stream静态方法创建
        Stream<String> stream4 = Stream.of("a", "b", "c");
        //3.通过Stream创建无限流
        Stream<Integer> stream5 = Stream.iterate(0, (x) -> x + 3);
        stream5.limit(10).forEach(System.out::println);

        Stream.generate(()->Math.random()).limit(10).filter((x)->x>0.5).forEach(System.out::println);
    }

    @Test
    public void test2(){
        students.stream().sorted((e1,e2) ->{
            if (e1.getAge() == e2.getAge()){
                return e1.getStudentName().compareTo(e2.getStudentName());
            }else {
                return e1.getAge().compareTo(e2.getAge());
            }
        }).forEach(System.out::println);
    }
}
