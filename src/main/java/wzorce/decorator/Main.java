package wzorce.decorator;

public class Main {
    public static void main(String[] args) {

        DataSource ds = new FileDataSource("plik.txt");

        //ds.writeData("Ala ma kota");

        //System.out.println(ds.readData());

        DataSource eds = new EncryptionDecorator(ds);

        eds.writeData("Ala ma kota");
        System.out.println(eds.readData());
    }
}
