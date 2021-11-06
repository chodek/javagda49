package inputoutput.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) throws IOException {

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("src\\main\\resources\\user.txt");
            out = new FileWriter("src\\main\\resources\\user_output.txt", true);

            int c;

            while ((c = in.read()) != -1) {
                out.append((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }


    }

}
