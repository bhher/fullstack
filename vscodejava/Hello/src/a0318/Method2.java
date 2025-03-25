package a0318;

public class Method2 {
    public static void main(String[] args) {
        
        int sum1 = add(5,10);
        System.out.println("결과1 출력: "+sum1);
        int sum2 = subtract(10,5);
        System.out.println("결과1 출력: "+sum2);

        }
                
        public static int subtract(int i, int j) {
            System.out.println(i+ " - " + j + " 연산수행");
            int sum2 = i - j;
            return sum2;
        }
        
       public static int add(int a, int b) {
       System.out.println(a+ " + " + b + " 연산수행");
       int sum1 = a + b;
       return sum1;
    }
    //add ,subtract , multiply, divide
}
