package hm.controller;

import hm.domain.Order;
import hm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    public void addOrder() {
        orderService.save(new Order());
    }
}
