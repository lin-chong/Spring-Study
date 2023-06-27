package com.llt;

import com.llt.entity.User;
import com.llt.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("entity.xml");
        User user = (User) context.getBean("User");
        System.out.println("User: " + user);

        UserService userService = context.getBean("userService", UserService.class);
        System.out.println("userService: " + userService);

        UserService userService2 = context.getBean("userService2", UserService.class);
        System.out.println("userService: " + userService2);

    }
}
