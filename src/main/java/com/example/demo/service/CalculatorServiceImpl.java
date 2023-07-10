package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public double plus(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double minus(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        throw new IllegalArgumentException("You cant divide with 0!");
    }
}
