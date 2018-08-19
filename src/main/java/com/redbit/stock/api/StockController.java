package com.redbit.stock.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Random;

/**
 * Created by parmod.kumar on 8/18/2018.
 */
@RestController
@RequestMapping(path = "/api/v1")
public class StockController {

    @RequestMapping(path = "/price", method = RequestMethod.GET)
    public BigDecimal getPrice(@RequestParam("symbol") String symbol) throws IOException {
        Random random = new Random();
        return BigDecimal.valueOf(random.nextDouble() * 10);
    }
}
