package inputoutput.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Showcase {
    public static void main(String[] args) throws IOException {

        FileOutputStream out = null;
        try (FileInputStream in = new FileInputStream("user.txt")) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
