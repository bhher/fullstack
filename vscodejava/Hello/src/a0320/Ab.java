package a0320;

import java.util.Scanner;

public class Ab {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 개의 문자열 입력 받기
        System.out.println("두 개의 문자열을 입력하세요:");
        String str1 = scanner.nextLine(); // nextLine()를 사용하여 공백을 포함한 문자열 입력 받기
        String str2 = scanner.nextLine();

        // 입력받은 문자열을 이어서 출력
        String result = str1 + str2;
        System.out.println(result);

        scanner.close();
    }
}
