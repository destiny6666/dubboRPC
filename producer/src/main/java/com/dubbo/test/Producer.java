package com.dubbo.test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Producer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"application.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}