package a0312;

public class Var7 {
    public static void main(String[] args) {
        //정수
        byte b = 127; //-128~127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; //-2,147,483,648 ~ 2,147,483,647 (약 20억)
        //정수형은 대표가 int

        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L;

        //실수 실수형 대표는 double
        float f = 10.0f;
        double d = 10.0;

        //변수명
        //int 1num = 10; 변수이름은 숫자로 시작할 수 없다.(num1)
        //int int = 20; 자바의 예약어를 변수이름으로 사용못함(int, class, publc)
        //변수명에는 영문자 , 숫자  , 달러기회($) 또는 밑줄(_)만 사용
        //변수명 소문자로 시작하는것이 일반적, 소문자로 시작해서 그 이후의 각단어는 대문자로시작
        //낙타 표기법(camel case)사용한다.  (예 orderDetail, myAccount)

        //자바 정리
        // 자바에서 클래스 이름의 첫 글자는 대문자로 시작한다. 그리고 나머지는 모두 첫 글자 
        //소문자로 시작한다. 여기에 낙타 표기법적용
        // 클래스 : Person, OrderDetail
        // 변수를 포함한 나머지 : firstName, userAccount
        //예외2개
        // 상수 모두 대문자 를 사용한고 언더바를 구분
        // USER_LIMIT
        // 패키지는 모두 소문자
        //org.spring.boot

    }
}
