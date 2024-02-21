package com.ohgiraffers.calculator.feature;

import com.ohgiraffers.calculator.run.Application;

import static com.ohgiraffers.calculator.run.Application.minusNumber;

public class Minus {

    public static void MinusApp() {

        int number1 = 60;
        int number2 = 40;

        System.out.println("뺄셈 계산을 시작합니다.");

        int result = minusNumber(number1,number2);

        System.out.println("결과 = " + result);
    }



}
