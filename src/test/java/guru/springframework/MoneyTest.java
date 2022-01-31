package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar dollar = new Dollar(5d);
        Dollar product = dollar.multiply(2d);
        assertEquals(10d, (double) product.getAmount());
        product = dollar.multiply(3d);
        assertEquals(15d, (double) product.getAmount());
    }
}
