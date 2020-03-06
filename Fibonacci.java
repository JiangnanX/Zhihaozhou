package com.homework.test;

import java.math.BigDecimal;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            System.out.println(" Fibonacci.of(" + i + ") == " + Fibonacci.of(i));
        }
    }
    public static BigDecimal of (int n) {
        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal("1");
        BigDecimal c = null;
        if (n == 1 || n == 2) {
            return a;
        } else {
            for (int i = 3; i <= n; i++) {
                c = a.add(b);
                a = b;
                b = c;
            }
            return c;
        }
    }
}
