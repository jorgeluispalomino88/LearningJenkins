package com.palo.jenkinsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CalculatorController {

    @Autowired
    private Calculator calculator;

    @RequestMapping("/sum")
    String Sum (@RequestParam("a") Integer a,
                @RequestParam("b") Integer b){

        return String.valueOf(calculator.Sum(a,b));
    }


}
