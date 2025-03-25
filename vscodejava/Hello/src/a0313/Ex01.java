package a0313;

public class Ex01 {
    public static void main(String[] args) {
        // 세자리 정수의 각 자릿수 총합을 출력하려 한다.
        // num = 374
        // 정수 374의 각 자릿수의 총합 : 14
        //힌트1  3+ 7 + 4 =14
        //힌트2.  는  % 나머지와 / 나누기를 적절히 이용 
        // 힌트3. 100으로 나누고 10으로 나누고 나머지 이용
        int num = 374;
        int one = num % 10; //몫 37 나머지 4
        int ten = num / 10 % 10; // 10의 자리숫자
        int hun = num / 100 ; //100의자리 숫자
        int sum = one + ten + hun;
        
        //출력
        System.out.printf("정수 %d의 각 자릿수의 총합: %d",num,sum);


    }
}
