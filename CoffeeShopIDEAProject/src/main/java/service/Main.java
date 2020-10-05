package service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-context.xml");

        /*
        1. Create all neseccary equipment
        2. Lazy initializations of ingridients
        3. Ready to serve orders
         */

    }
}
