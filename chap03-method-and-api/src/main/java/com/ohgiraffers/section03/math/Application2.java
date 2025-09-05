package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application2 {
    public static void main(String[] args) {
        /* 사용자 범위의 난수 발생 시키기 */

        /* Math.random() */
        /* 1~10 범위의 랜덤값 */
        int randomNum = (int) (Math.random() * 10) + 1;
        System.out.println(randomNum);

        /* Random 클래스 */
        Random random = new Random();
        /* 1~10 범위의 값 */
        int randomNum2 = random.nextInt(10) + 1;
        System.out.println(randomNum2);
    }
}
