import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

    public class test1 {
        public static void main(String[] args) {
            // While Loop
            int i = 1;
            while (i < 10) {
                System.out.println(6 * i);
                i = i + 1; // i++ 하면 자동으로 1이 증가함!
            }

            // For Loop 위 과정을 For Loop로 더욱 단순하게 만들 수 있음!
            for (int j = 1; j < 10; j++) {
                System.out.println(7 * j);
            }
        }
    }