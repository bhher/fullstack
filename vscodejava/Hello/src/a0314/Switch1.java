package a0314;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.print("쿠폰의 번호를 입력하시오 : ");
        int grade = scanner.nextInt();
        int coupon ;
    
        switch(grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
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
