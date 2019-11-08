package com.xfma.spring.test;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * TODO 请添加说明
 *
 * @author mxf
 * @version 1.0
 */
public class Test {

    @org.junit.Test
    public void run(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        System.out.println("-----spring------启动完成-----------");
        AutowireCapableBeanFactory autowireCapableBeanFactory = context.getAutowireCapableBeanFactory();
        //DefaultListableBeanFactory最牛的beanFactory，可以在程序运行的时候通过DefaultListableBeanFactory往容器中添加bean
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) autowireCapableBeanFactory;
    }
}
