package inputoutput.serializing;

import biblioteka.Author;
import biblioteka.Copy;
import biblioteka.Library;
import biblioteka.Magazine;

import java.io.*;

public class SerializationShowcase {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        FileOutputStream fos = new FileOutputStream("someObject.data");
        ObjectOutputStream out = new ObjectOutputStream(fos);

        Library biblioteka = new Library(new Copy[]{new Magazine(new Author("imie", "Nazwisko"), "jakis tytul")});
        out.writeObject(biblioteka);

        // deserializacja - czyli wczytanie obiektu
        FileInputStream fis = new FileInputStream("someObject.data");
        ObjectInputStream in = new ObjectInputStream(fis);
        Library deserializedLibrary = (Library) in.readObject();

        System.out.println(deserializedLibrary);
        System.out.println(biblioteka == deserializedLibrary);
    }
}
