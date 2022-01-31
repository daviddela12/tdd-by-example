package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar dollar = new Dollar(5d);
        dollar.multiply(2d);
        assertEquals(10d, (double) dollar.amount);
    }
}
