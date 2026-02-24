package inBuild;

import java.util.function.Supplier;
import java.util.UUID;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> uuidSupplier = () -> UUID.randomUUID().toString();
        Supplier<Double> randomSupplier = Math::random;

        System.out.println("UUID: " + uuidSupplier.get());
    }
}