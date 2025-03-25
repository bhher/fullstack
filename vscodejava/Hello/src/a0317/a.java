package a0317;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("삼각형의 높이를 입력하세요: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) { // 행 반복
            for (int j = 1; j <= rows - i; j++) { // 공백 출력
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // 별 출력
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }

        scanner.close();
    }
}
