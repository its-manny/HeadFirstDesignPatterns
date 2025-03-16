package Decorator.IODecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

    public static void main(String[] args) {
        int c;

        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("D:\\Projects\\Java\\HeadFirstDesignPatterns\\src\\Decorator\\IODecorator\\test.txt")));
            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
