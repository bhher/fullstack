package a0328.file;

import java.io.IOException;
import java.io.InputStream;

public class Input1 {
    public static void main(String[] args)  throws IOException {
        InputStream in = System.in;
        //System.in - 키보드로 입력 받겠다.
        //InputStream read 에서는 1byte 크기의 사용자입력
         int a;
         a = in.read();
         System.out.println(a);
        //아스키코드는 7비트를 활용한 문자 표현코드
        //알파벳대소문자, 숫자0~9,특수기호
        //숫자 0 은 아스키코드값은 48, 문자 a 는 97

    }
}
