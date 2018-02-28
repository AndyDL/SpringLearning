package com.hpe.andy.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class App {
    public static void main( String[] args ){
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/firstLayer.xml");
        SecondBean bean = (SecondBean) context.getBean("segundoBean");
        //FirstBean bean = context.getBean("firstBean", Firstbean.class);
        bean.printSomething();
        System.out.println(bean.getEscuela());

    }
}
