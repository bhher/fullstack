package a0328.file;

import java.io.IOException;
import java.io.InputStream;

import java.io.InputStreamReader;

public class Input4 {
    public static void main(String[] args)  throws IOException {
        InputStream in = System.in;
        InputStreamReader reader =  new InputStreamReader(in);
        //byte대신 문자로 입력스트임을 읽으려면 InputStreamReader
        char[] a = new char[3];
        reader.read(a);

        System.out.println(a);
      

    }
}
