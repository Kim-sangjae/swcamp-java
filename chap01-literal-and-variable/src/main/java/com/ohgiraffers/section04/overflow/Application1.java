package com.ohgiraffers.section04.overflow;

public class Application1 {
    public static void main(String[] args) {
        /* 오버플로우에 대해 이해할 수 있다. */
        byte num1 = 127;
        System.out.println("num1 = " + num1);

        num1++; // 현재 변수가 가진 값에서 1 증가 시켜주는 연산자
        System.out.println("num1 = " + num1);

        /* 언더플로우 */
        byte num2 = -128;
        System.out.println("num2 = " + num2);

        num2--; // 현재 변수가 가진 값에서 1 감소 시켜주는 연산자
        System.out.println("num2 = " + num2);
    }
}
