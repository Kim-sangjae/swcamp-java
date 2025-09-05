package com.ohgiraffers.section01.method;

public class Application5 {
    public static void main(String[] args) {
        /* static 메소드를 호출할 수 있다. */
        Application5 application5 = new Application5();
        System.out.println(application5.plus(10, 20));
        /* static 메소드는 호출 시 클래스명.메소드명() 으로 호출한다. */
        System.out.println(Application5.minus(20, 10));
        /* 동일 클래스 안에서 작성 된 static 메소드는 클래스명을 생략할 수 있다. */
        System.out.println(minus(30, 10));
    }

    /* non-static 메소드 */
    public int plus(int a, int b) {
        return a + b;
    }
    /* static 메소드 */
    public static int minus(int a, int b) {
        return a - b;
    }
}
