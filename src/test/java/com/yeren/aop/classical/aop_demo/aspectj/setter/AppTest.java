package com.yeren.aop.classical.aop_demo.aspectj.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.yeren.aop.classical.aop.demo.aspectj.setter.Sleepable;
public class AppTest {  
    public static void main(String[] args){  
        @SuppressWarnings("resource")  
        //如果是web项目，则使用注释的代码加载配置文件，这里是一般的Java项目，所以使用下面的方式  
        //ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");  
        ApplicationContext ac = new FileSystemXmlApplicationContext("application.xml");  
        Sleepable me = (Sleepable)ac.getBean("me");  
        me.sleep();  
    }  
}  