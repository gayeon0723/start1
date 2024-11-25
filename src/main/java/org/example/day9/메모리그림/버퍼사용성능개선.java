package org.example.day9.메모리그림;

import java.io.*;

public class 버퍼사용성능개선 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("c:/data/공부.txt");
            Reader reader = new InputStreamReader(is);
            BufferedReader bf = new BufferedReader(reader);
            //BufferedReader bf2 = new BufferedReader(new FileReader("c:/data/data.txt"));
            while (true){
                String line = bf.readLine();
                if (line == null) break;
                System.out.println(line);
            }
            is.close();
            reader.close();
            bf.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
