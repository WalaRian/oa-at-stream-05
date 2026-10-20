package methods;

import static methods.ImplementedMethods.transformName;

public class TestClass {
    ImplementedMethods implementedMethods = new ImplementedMethods();

    void run() {
        int lastDigit = implementedMethods.getLastDigit(11);
        int anotherListDigit = new ImplementedMethods().getLastDigit(12);

        String transformedName = transformName("Bob");
    }
}
