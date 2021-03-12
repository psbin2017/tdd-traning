package tdd.traning.money;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FrancTest {

    @Test
    public void testFrancMultiplication() throws Exception {
        // given
        Money franc = Money.franc(5);

        // when

        // then
        assertNotEquals(Money.franc(5), franc.times(2));
        assertEquals(Money.franc(10), franc.times(2));
    }

    @Test
    public void testFrancEquality() throws Exception {
        assertEquals(Money.franc(5), Money.franc(5));
    }

    @Test
    public void testFrancNonEquality() throws Exception {
        assertNotEquals(Money.franc(6), Money.franc(5));
    }
}