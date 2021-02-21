package ru.mnregasimenko.testwebapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        TestWebApp testWebApp = context.getBean("testBean", TestWebApp.class);
        System.out.println(testWebApp.getName());

        context.close();

    }


}
