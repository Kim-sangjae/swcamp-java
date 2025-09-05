package com.ohgiraffers.section02.package_and_import;

public class Application1 {
    public static void main(String[] args) {
        /* 클래스명은 패키지명을 포함하고 있으며
        * 다른 패키지에 존재하는 클래스를 사용할 때는 풀 클래스명을 사용해야 한다.
        * */
        com.ohgiraffers.section01.method.Calculator calculator
                = new com.ohgiraffers.section01.method.Calculator();
        System.out.println(calculator.min(10, 20));
        System.out.println(calculator.max(10, 20));
    }
}
