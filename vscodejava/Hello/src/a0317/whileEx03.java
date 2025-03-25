package a0317;

import java.util.Scanner;

public class whileEx03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        
        while(run){
            System.out.println("--------------------------------------------");
            System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4. 나눗셈 | 5. 종료");
            System.out.println("--------------------------------------------");
            System.out.print("선택 > ");

            
            int choice =  Integer.parseInt(scanner.nextLine());
            if(choice == 5 ){
                run = false;
                continue; //while 루프 다시실행(종료메세지 출력)
            }

            System.out.print("첫 번째 숫자>");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.print("두 번째 숫자>");
            int num2 = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("결과: " + num1 + "+" + num2 + " = " +(num1+num2));
                    break;
                case 2:
                    System.out.println("결과: " + num1 + "-" + num2 + " = " +(num1-num2));
                    break;
                case 3:
                    System.out.println("결과: " + num1 + "*" + num2 + " = " +(num1*num2));
                    break;
                case 4:
                    if(num2 == 0){
                        System.out.println("0 으로 나눌 수 없습니다.");
                    }else{
                    System.out.println("결과: " + num1 + "/" + num2 + " = " +((double)num1/num2));
                    }
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해 주세요");
            }
            System.out.println();
        }
        System.out.println("프로그램종료");
        scanner.close();
    }
}
