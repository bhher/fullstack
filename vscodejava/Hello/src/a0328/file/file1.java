package a0328.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class file1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("d:/out.txt");
        output.close();
    }
}
