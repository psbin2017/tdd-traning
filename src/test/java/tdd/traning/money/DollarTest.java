package tdd.traning.money;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DollarTest {

    @Test
    public void testDollarMultiplication() throws Exception {
        // given
        Dollar dollar = new Dollar(5);

        // when

        // then
        assertNotEquals(new Dollar(5), dollar.times(2));
        assertEquals(new Dollar(10), dollar.times(2));
    }

    @Test
    public void testDollarEquality() throws Exception {
        assertEquals(new Dollar(5), new Dollar(5));
    }

    @Test
    public void testDollarNonEquality() throws Exception {
        assertNotEquals(new Dollar(6), new Dollar(5));
    }
}