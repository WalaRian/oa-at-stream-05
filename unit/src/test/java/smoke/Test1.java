package smoke;

import methods.ImplementedMethods;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class Test1 {
    String name = "Bob";
    String expectedResult = "BoB";
    String actualResult = "";

    @Test
    void testBob() {
        actualResult = ImplementedMethods.transformName(name);

        System.out.println("INITIAL DATA : " + name);
        System.out.println("EXPECTED RESULT : " + expectedResult);
        System.out.println("ACTUAL RESULT : %s".formatted(actualResult));

        if (actualResult.equals(expectedResult)) {
            System.out.println("TEST PASS!");
        } else {
            System.out.println("TEST FAILED!");
        }
    }

    @Test
    void testAlice() {
        int randomPart = new Random().nextInt(100, 999);
        name = "Alice" + randomPart;
        expectedResult = "ALICE" + randomPart;
        actualResult = "";

        actualResult = ImplementedMethods.transformName(name);

        System.out.println("INITIAL DATA : " + name);
        System.out.println("EXPECTED RESULT : " + expectedResult);
        System.out.println("ACTUAL RESULT : %s".formatted(actualResult));

        if (actualResult.equals(expectedResult)) {
            System.out.println("TEST PASS!");
        } else {
            System.out.println("TEST FAILED!");
        }
    }
}
