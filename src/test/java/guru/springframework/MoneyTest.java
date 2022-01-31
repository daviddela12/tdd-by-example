package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplicationDollar() {
        Money dollar = Money.dollar(5d);
        assertEquals(Money.dollar(10d), dollar.multiply(2d));
        assertEquals(Money.dollar(15d), dollar.multiply(3d));
        assertNotEquals(Money.dollar(20d), dollar.multiply(3d));

        assertNotEquals(Money.dollar(5d), Money.franc(5d));
    }

    @Test
    void testEqualityDollar() {
        assertEquals(Money.dollar(5d), Money.dollar(5d));
        assertNotEquals(Money.dollar(5d), Money.dollar(3d));
    }

    @Test
    void testMultiplicationFranc() {
        Money franc = Money.franc(5d);
        assertEquals(Money.franc(10d), franc.multiply(2d));
        assertEquals(Money.franc(15d), franc.multiply(3d));
        assertNotEquals(Money.franc(20d), franc.multiply(3d));

        assertNotEquals(Money.franc(5d), Money.dollar(5d));
    }

    @Test
    void testEqualityFranc() {
        assertEquals(new Franc(5d), new Franc(5d));
        assertNotEquals(new Franc(5d), new Franc(3d));
    }

    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1d).getCurrency());
    }
}
