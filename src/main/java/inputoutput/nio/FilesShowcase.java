package inputoutput.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

public class FilesShowcase {
    public static void main(String[] args) throws IOException {
        Path one = null, two = null;

        Files.copy(one, two, StandardCopyOption.REPLACE_EXISTING);
        Files.isWritable(one);
        Files.isReadable(two);


        Files.delete(one);
        //Files.deleteIfExists();

        // Files.copy(...)
        // Files.move(...)

        //Files.createFile()
        Files.readAllLines(one).stream()
                .map(line -> line.split(" "))
                .flatMap(Arrays::stream)
                .filter(word -> word.equalsIgnoreCase("tadeusz"))
                .count();
        //Files.write()

    }
}
