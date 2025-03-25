package a0314;

import java.util.Scanner;

public class MoveRate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("평점을 입력하세요 : ");
        double rating  =scan.nextDouble();

        if(rating <= 9){
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}
