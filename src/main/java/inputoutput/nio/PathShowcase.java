package inputoutput.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PathShowcase {
    public static void main(String[] args) throws IOException {


        Path p1 = Paths.get("C:\\Users\\Chodek\\Desktop\\gda49\\src\\main\\resources\\user.txt");
        // Path p2 = Path.of(nazwaDysku, nazwafolderu, nazwaPliku);


        Path path = Paths.get("data.txt");
        Files.createFile(path);
        Files.write(path, "A long time ago in a galaxy far, far away....".getBytes(), StandardOpenOption.WRITE);
        Files.write(path, "in a galaxy far, ".getBytes(), StandardOpenOption.APPEND);
        Files.write(path, "far away....\n".getBytes(), StandardOpenOption.APPEND);
        for (String line : Files.readAllLines(path)) {
            System.out.println(line);
        }
        Files.delete(path);
    }
}
