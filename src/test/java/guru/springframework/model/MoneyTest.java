package guru.springframework.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Money dollar = Money.dollar(5d);
        assertEquals(Money.dollar(10d), dollar.multiply(2d));
        assertEquals(Money.dollar(15d), dollar.multiply(3d));
        assertNotEquals(Money.dollar(20d), dollar.multiply(3d));
        assertNotEquals(Money.dollar(5d), Money.franc(5d));

        Money franc = Money.franc(5d);
        assertEquals(Money.franc(10d), franc.multiply(2d));
        assertEquals(Money.franc(15d), franc.multiply(3d));
        assertNotEquals(Money.franc(20d), franc.multiply(3d));
        assertNotEquals(Money.franc(5d), Money.dollar(5d));
    }

    @Test
    void testEquality() {
        assertEquals(Money.dollar(5d), Money.dollar(5d));
        assertNotEquals(Money.dollar(5d), Money.dollar(3d));

        assertEquals(Money.franc(5d), Money.franc(5d));
        assertNotEquals(Money.franc(5d), Money.franc(3d));
    }

    @Test
    void testSumOperation() {
        Money money1 = Money.dollar(5d);
        SumOperation sumOperation = money1.plus(Money.dollar(10d));
        assertEquals(Money.dollar(5d), sumOperation.getOperand1());
        assertEquals(Money.dollar(10d), sumOperation.getOperand2());
        assertEquals(Money.dollar(15d), sumOperation.reduce("USD"));
    }

    @Test
    void testReduce() {
        SumOperation sumOperation = new SumOperation(Money.dollar(5d), Money.dollar(10d));
        Bank bank = new Bank();
        assertEquals(Money.dollar(15d), bank.reduce(sumOperation, "USD"));
    }

    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1d).getCurrency());
    }
}
