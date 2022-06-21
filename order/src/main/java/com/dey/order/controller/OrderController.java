package com.dey.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author deyran
 * @date 2022/6/17
 * @package com.dey.order.controller
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add() {
        System.out.println("下单成功");
        String msg = restTemplate.getForObject("http://localhost:8011/stock/reduct", String.class);

        return "Hello word" + msg;
    }
}
