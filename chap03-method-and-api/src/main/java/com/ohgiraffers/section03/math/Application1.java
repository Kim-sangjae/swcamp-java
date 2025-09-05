package com.ohgiraffers.section03.math;

public class Application1 {
    public static void main(String[] args) {
        /* Math 클래스에서 제공하는 static 메소드를 호출 할 수 있다. */
        /* import java.lang.*; <- 컴파일러가 자동으로 추가하기 때문에
        * 해당 패키지 하위의 클래스 기능들은 import 없이 활용 가능하다. */

        /* 절대값 */
        System.out.println(Math.abs(-7));

        /* 최소값, 최대값 */
        System.out.println(Math.min(10, 5));
        System.out.println(Math.max(10, 5));

        /* 난수 출력 */
        System.out.println(Math.random());
    }
}
