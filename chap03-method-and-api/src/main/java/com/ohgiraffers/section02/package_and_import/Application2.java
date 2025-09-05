package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

public class Application2 {
    public static void main(String[] args) {
        /* 매번 풀 클래스명을 작성하기는 힘들기 때문에 import 구문을 제공하고 있다.
        * import 구문은 package 선언문과 class 선언문 사이에 배치 된다. */
        Calculator calculator = new Calculator();
        System.out.println(calculator.min(10, 20));
        System.out.println(calculator.max(10, 20));
    }
}
