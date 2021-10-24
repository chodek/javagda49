package programowaniefunkcyjne.interfejsyfunkcyjne;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Test suppliera!";
        printValueFromSupplier(supplier);


        printValueFromSupplier(() -> "Test!");
        printValueFromSupplier(() -> 123);


    }


    static void printValueFromSupplier(Supplier supplier) {
        System.out.println(supplier.get());
    }
}
