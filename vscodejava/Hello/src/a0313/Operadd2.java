package a0313;

public class Operadd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        b = ++a; //a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b); //a=2 b=2
         
        a = 1;
        b = 0;
        b = a++; //a의현재값을 b에 먼저 대입하고, 그 후 a값을 증가시킴
        System.out.println("a = " + a + ", b = " + b); //a=2 b=1
    }
}
