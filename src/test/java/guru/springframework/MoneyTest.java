package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar dollar = new Dollar(5d);
        Dollar product = dollar.multiply(2d);
        assertEquals(new Dollar(10d), product);
        product = dollar.multiply(3d);
        assertEquals(new Dollar(15d), product);
        assertNotEquals(new Dollar(20d), product);
    }

    @Test
    void testEquality() {
        assertEquals(new Dollar(5d), new Dollar(5d));
        assertNotEquals(new Dollar(5d), new Dollar(3d));
    }
}
