package com.palo.jenkinsdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
class Calculator {

    int Sum(int a, int b) {
        return a + b;
    }
}

