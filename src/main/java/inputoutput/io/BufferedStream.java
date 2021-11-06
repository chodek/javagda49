package inputoutput.io;

import java.io.*;

public class BufferedStream {
    public static void main(String[] args) throws IOException {

        BufferedReader in = null;
        BufferedWriter out = null;

        try {
            in = new BufferedReader(new FileReader("src\\main\\resources\\user.txt"));
            out = new BufferedWriter(new FileWriter("src\\main\\resources\\user_output.txt"));

            String line;

            while ((line = in.readLine()) != null) {
                out.write(line + '\n');
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
