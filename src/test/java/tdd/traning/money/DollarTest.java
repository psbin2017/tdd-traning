package tdd.traning.money;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DollarTest {

    @Test
    public void testDollarMultiplication() throws Exception {
        // given
        Money dollar = Money.dollar(5);

        // when

        // then
        assertNotEquals(Money.dollar(5), dollar.times(2));
        assertEquals(Money.dollar(10), dollar.times(2));
    }

    @Test
    public void testDollarEquality() throws Exception {
        assertEquals(Money.dollar(5), Money.dollar(5));
    }

    @Test
    public void testDollarNonEquality() throws Exception {
        assertNotEquals(Money.dollar(6), Money.dollar(5));
    }
}