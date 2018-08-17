package hm;

import hm.controller.OrderController;
import hm.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        UserController userController = (UserController) ac.getBean("userController");
        userController.addUser();
        OrderController orderController = (OrderController) ac.getBean("orderController");
        orderController.addOrder();
    }
}
//aaa
//bbb
//ccc
//ddd