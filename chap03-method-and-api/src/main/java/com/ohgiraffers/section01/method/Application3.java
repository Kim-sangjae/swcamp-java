package com.ohgiraffers.section01.method;

public class Application3 {
    public static void main(String[] args) {
        /* 전달인자(argument)와 매개변수(parameter)에
        대해 이해하고 메소드 호출 시 사용 할 수 있다. */

        Application3 application3 = new Application3();
        /* 전달인자는 매개변수의 타입, 갯수, 순서 등이 일치해야 한다. */
        application3.testMethod(40);
        application3.testMethod(30);
//        application3.testMethod();
//        application3.testMethod(20, 30);
//        application3.testMethod("20");

//        application3.testMethod2(20, "홍길동", '남');
        application3.testMethod2("홍길동", 20, '남');
        application3.testMethod2("유관순", 16, '여');

    }

    /* int 타입의 매개변수(parameter)를 전달받는 메소드 선언 */
    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }

    /* 매개변수에서 상수를 활용하는 메소드 */
    public void testMethod2(String name, int age, final char gender) {
        /* 매개변수도 일종의 지역변수이다.
        * 단, 상수 네이밍 규칭을 선택적으로 따르는 경향이 있다. */
//        name = "홍길동";
//        age = 20;
//        gender = '남';
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세이고 "
        + "성별은 " + gender + "입니다.");
    }



}
