package org.example.day8.class사용;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class 출력스트림2 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:/data/imsi.txt");
            //byte a = 10;
            //byte b = 20;
            //byte c = 30;
            byte[] array = {10, 20, 30};
            String str = "안녕!";
            byte[] word = str.getBytes();
            //os.write(a);
            //os.write(b);
            //os.write(c);
            os.write(word);

            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace(); //자세하게 프린트
        }
    }
}
