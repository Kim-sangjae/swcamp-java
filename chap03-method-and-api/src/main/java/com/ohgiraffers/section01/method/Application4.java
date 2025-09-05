package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {
        Application4 application4 = new Application4();
        /* 반환 값이 있는 메소드는 호출만 하면 안되고 리턴 값을 활용해야 한다. */
        application4.testMethod();
        /* 변수에 담아서 출력 */
        String result = application4.testMethod();
        System.out.println(result);
        /* 출력 메소드에 반환 값을 바로 인자로 넘겨서 출력 */
        System.out.println(application4.testMethod());

    }

    /* String 값을 반환하는 메소드 */
    public String testMethod() {
        return "Hello World!";
    }

    public void testMethod2() {
        /* 컴파일러가 자동으로 메소드 끝에 return 구문을 추가 하기 때문에
        * 명시적으로 작성할 필요가 없으나
        * 필요하다면 작성할 수 있다. (조건문 등에서) */
        System.out.println("출력문1");
        return;
        /* 명시적 return 구문 작성 시 명령문 작성 불가
        * 메소드는 종료 후 호출 했던 곳으로 돌아가게 된다. */
//        System.out.println("출력문2");
    }
}
