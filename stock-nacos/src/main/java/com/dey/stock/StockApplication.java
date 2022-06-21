package com.dey.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author deyran
 * @date 2022/6/17
 * @package com.dey.stock.controller.com.dey.stock
 */
@SpringBootApplication
//@EnableDiscoveryClient
public class StockApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockApplication.class, args);
    }
}
