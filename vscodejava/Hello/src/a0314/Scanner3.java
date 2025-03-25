package a0314;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요: ");
        int num1  = scanner.nextInt(); 
        System.out.print("두번째 숫자를 입력하세요: ");
        int num2  = scanner.nextInt(); 
        System.out.println(num1+" "+num2);
    }
}
