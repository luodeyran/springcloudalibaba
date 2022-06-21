package com.dey.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author deyran
 * @date 2022/6/17
 * @package com.dey.stock.controller
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/reduct")
    public String reduct(){
        System.out.println("扣减库存");
        return "扣减库存";
    }
}
