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

        /* int 자료형의 연산 */
        int firstNum = 1000000;
        int secondNum = 700000;
        int multiNum = firstNum * secondNum;
        System.out.println("multiNum = " + multiNum);
        long multiNum2 = (long)firstNum * secondNum;
        System.out.println("multiNum2 = " + multiNum2);

        /* 오버플로우, 언더플로우는 컴파일 에러를 발생시키지는 않지만
        * 최소~최대값의 범위를 고려한 자료형 선정을 하지 않으면 논리적 에러가 발생할 수 있다. */

    }
}
