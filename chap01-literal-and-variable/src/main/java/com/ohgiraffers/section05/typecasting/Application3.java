package com.ohgiraffers.section05.typecasting;

public class Application3 {
    public static void main(String[] args) {
        /* int 미만의 자료형의 연산에서 주의할 점
        * byte와 short 타입은 연산 결과가 int로 처리 된다. */
        byte byteNum1 = 1;
        byte byteNum2 = 2;
//        byte result = byteNum1 + byteNum2;
        int result = byteNum1 + byteNum2;

        short shortNum1 = 1;
        short shortNum2 = 2;
//        short result2 = shortNum1 + shortNum2;
        int result2 = shortNum1 + shortNum2;
    }
}
