package com.ohgiraffers.section01.literal;

public class Application2 {
    public static void main(String[] args) {
        /* 값을 연산하여 출력할 수 있다.
        * 이 때, 값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다.
        * */

        /* 정수와 정수 */
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);
        /* 실수와 실수 */
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);			//약간의 오차가 생긴다
        /* 실수와 정수 => 내부적으로 정수가 실수로 변환 되어 연산 */
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);
    }
}
