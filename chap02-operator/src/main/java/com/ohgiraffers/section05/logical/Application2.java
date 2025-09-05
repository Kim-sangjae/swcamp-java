package com.ohgiraffers.section05.logical;

public class Application2 {
    public static void main(String[] args) {
        /* 논리 연산자를 활용할 수 있다. */

        /* 1부터 100사이의 값인지 확인 */
        int num = 90;
        System.out.println("num은 1~100 사이 값인가? : " + (num >= 1 && num <= 100));

        /* 특정 문자가 대문자인지 확인 */
        char ch = 'X';
        System.out.println("ch는 대문자인가? : " + (ch >= 'A' && ch <= 'Z'));

        /* 대소문자 상관 없이 y 인지 확인 */
        char ch2 = 'n';
        System.out.println("y인가? : " + (ch2 == 'Y' || ch2 == 'y'));

        /* 대소문자 상관 없이 영문자인지 확인 */
        char ch3 = '가';
        System.out.println("대소문자 상관 없이 영문자인지? : " +
                ((ch3 >= 'a' && ch3 <= 'z') || (ch3 >= 'A' && ch3 <= 'Z')));

    }
}
