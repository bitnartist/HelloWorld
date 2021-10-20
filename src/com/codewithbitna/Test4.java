package com.codewithbitna;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Test4 {
    public static void test4(String[] args) {
        // 배열, 2단
        int[] result = new int[9];
        for(int i=0; i < result.length; i++) {
            result[i] = 2 * (i + 1); // i가 0이기 때문에 +1을 해서 1을 만들고 곱셈을 만듦
        }
        for(int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }
        // 3단, int를 지우고 진행하는 방법
        result = new int[9];
        for(int i=0; i < result.length; i++) {
            result[i] = 2 * (i + 1); // i가 0이기 때문에 +1을 해서 1을 만들고 곱셈을 만듦
        }
        for(int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }
        // 3단, 다른 배열에 저장하고 싶을 경우 이름을 바꿔서
        int[] times3 = new int[9];
        for(int i=0; i < times3.length; i++) {
            times3[i] = 3 * (i + 1); // i가 0이기 때문에 +1을 해서 1을 만들고 곱셈을 만듦
        }
        for(int i=0; i<times3.length; i++) {
            System.out.println(times3[i]);
        }
    }
}