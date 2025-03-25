package a0317;

import java.util.Scanner;

public class whileEx02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int balance = 0;

        while (run) { // true 대신 run 사용 가능
            System.out.println("---------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
            System.out.println("---------------------------------");
            System.out.print("선택 > ");

            int menuNum = Integer.parseInt(scanner.nextLine());

            switch (menuNum) {
                case 1:
                    System.out.print("예금액> ");
                    balance += Integer.parseInt(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("출금액> ");
                    balance -= Integer.parseInt(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("잔고> ");
                    System.out.println(balance);
                    break;
                case 4:  
                    run = false; // 루프 종료 조건 변경
                    break;  // break 추가하여 switch문 종료 후 while문도 종료됨
            }
            System.out.println();
        }
        
        System.out.println("프로그램 종료"); // while문 밖에 있으므로 정상적으로 실행됨
        scanner.close(); // Scanner 닫기
    }
}
