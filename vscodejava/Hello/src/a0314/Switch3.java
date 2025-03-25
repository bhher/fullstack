package a0314;

import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.print("쿠폰의 번호를 입력하시오 : ");
        int grade = scanner.nextInt();
         //자바 14버전 이상 switch 문
        //grade 1:1000, 2:2000(변경), 3:3000, 나머지: 500
        int coupon = switch(grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
          
        };

        scanner.close();
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
