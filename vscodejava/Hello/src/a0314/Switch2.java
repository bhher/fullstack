package a0314;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.print("쿠폰의 번호를 입력하시오 : ");
        int grade = scanner.nextInt();
        int coupon ;
        //grade 1:1000, 2:3000(변경), 3:3000, 나머지: 500
        switch(grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break; 
            default:
                coupon = 500;
                break;           
        }

        scanner.close();
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
