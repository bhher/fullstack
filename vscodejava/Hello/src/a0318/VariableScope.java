package a0318;

public class VariableScope {
    public static void main(String[] args) {
        int x = 5; 
        System.out.println("x = " + x); // (1) x = 5 출력
        print(x);                       // (2) print() 함수 호출
        System.out.println("x = " + x); // (5) x = 5 출력 (변경되지 않음)
    }

    public static void print(int x) {   
        System.out.println("x = " + x); // (3) x = 5 출력 (main의 x가 전달됨)
        x = x + 10;                      // (4) x 값을 10 증가 (지역 변수 변경)
        System.out.println("x = " + x); // (4) x = 15 출력
    }
}
