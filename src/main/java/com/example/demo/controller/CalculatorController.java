package com.example.demo.controller;

import com.example.demo.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class CalculatorController {
    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping
    public String greetings() {
        return "Greetings! This is Calculator!";
    }
@GetMapping(path = "plus")
    public String plus(@RequestParam double num1, @RequestParam double num2) {
        double result = service.plus(num1, num2);
        return String.format("Calculation result: %f + %f = %f", num1, num2, result);
    }
@GetMapping(path = "minus")
    public String minus(@RequestParam double num1, @RequestParam double num2) {
        double result = service.minus(num1, num2);
        return String.format("Calculation result: %f - %f = %f", num1, num2, result);
    }
@GetMapping(path = "multiply")
    public String multiply(@RequestParam double num1, @RequestParam double num2) {
        double result = service.multiply(num1, num2);
        return String.format("Calculation result: %f * %f = %f", num1, num2, result);
    }
@GetMapping(path = "divide")
    public String divide(@RequestParam double num1, @RequestParam double num2) {
        double result = service.divide(num1, num2);
        return String.format("Calculation result: %f / %f = %f", num1, num2, result);
    }
}
