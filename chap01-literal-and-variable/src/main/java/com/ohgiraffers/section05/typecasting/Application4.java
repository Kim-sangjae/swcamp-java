package com.ohgiraffers.section05.typecasting;

public class Application4 {
    public static void main(String[] args) {
        /* 강제 형변환 시 데이터 손실이 발생할 수 있다. */
        int inum = 290;
        byte bnum = (byte) inum;

        System.out.println("inum : " + inum);
        System.out.println("bnum : " + bnum);		//비트 앞부분 손실로 예측 어려움

        /* 의도적으로 데이터 손실 : 실수 -> 정수로 소수점 절삭 */
        double height = 173.5;
        int floorHeight = (int) height;
        System.out.println("floorHeight : " + floorHeight);
    }
}
