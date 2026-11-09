package test20261108;

import java.io.FileWriter;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("Exercise\\a.txt");
        for (int i = 0; i < 81; i++) {
            f.write(97);

        }
        f.write(98);
        f.flush();
        f.close();
    }
}
