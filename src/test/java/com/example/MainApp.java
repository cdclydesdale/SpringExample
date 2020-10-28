package com.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApp {
    public static void main(String args[])throws IOException {
        try {
            AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
            HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
            String str = obj.getMessage();
            System.out.println("First Object "+str);

            HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
            obj2.setMessage("Its a Beautiful world");
            String str2 = obj2.getMessage();
            System.out.println("Second Object "+str2);

            HelloWorld obj3 = (HelloWorld) context.getBean("helloWorld");
            obj3.setMessage("Always Inspire!");
            String str3 = obj3.getMessage();
            System.out.println("Second Object "+str3);

            //So that bean will be destroyed in the end
            context.registerShutdownHook();

        }catch(BeansException e){
            e.printStackTrace();
        }
    }
}
