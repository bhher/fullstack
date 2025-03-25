package a0314;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("실수를 입력하세요: ");
        float num1  = scanner.nextFloat(); 
        //1.59254
        num1 = (num1 + 0.005f)* 100;
        System.out.println(num1); //159.754
        int i = (int) num1;
        System.out.println(i); //159
        num1 = (float) i / 100;
        System.out.println(num1);


        //System.out.printf("%.2f", num1);
        
        

    }
}
