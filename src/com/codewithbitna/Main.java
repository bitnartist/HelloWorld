package com.codewithbitna;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 8, 9단
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in); // 변수
        int number = scanner.nextInt();
        System.out.println("사용자가 입력한 값 : " + number);

        if (number < 2) { // if문, 2~9단을 출력하고 싶다고 가정했을 때, number가 2보다 작을 경우 아래의 문구를 출력
            System.out.println("값을 잘못 입력했습니다.");
        } else if (number > 9) { // 이번엔 number가 9보다 클 경우 아래의 문구를 출력
            System.out.println("값을 잘못 입력했습니다.");
        } else { // ??
            for(int i = 1; i < 10; i++) { // for loop
                System.out.println(number * i);
            }
        }
    }
}
// For Loop
//for(int i = 1; i < 10; i++) {
//System.out.println(number * i);