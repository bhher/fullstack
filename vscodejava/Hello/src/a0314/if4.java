package a0314;

import java.util.Scanner;

public class if4 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.print("쿠폰의 번호를 입력하시오 : ");
        int grade = scanner.nextInt();
        int coupon ;
        if(grade == 1){
            coupon = 1000;
        }else if(grade == 2){
            coupon = 2000;
        }else if(grade == 3){
            coupon = 3000;
        }else{
            coupon = 500;
        }
        scanner.close();
        System.out.println("발급받은 구폰 " + coupon);
    }
}
