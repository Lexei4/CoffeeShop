package service;

import model.Ingridient;
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

        IngridientService ingridientService = (IngridientService) context.getBean("ingridientService");

        Ingridient coffeeBeans = new Ingridient();
        coffeeBeans.setOrigin("Brazil");
        coffeeBeans.setAmmount(200.00);
        coffeeBeans.setId(0001);
        coffeeBeans.setPrice(10);

        ingridientService.addIngredient(coffeeBeans);


    }
}
