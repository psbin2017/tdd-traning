package tdd.traning.money;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FrancTest {

    @Test
    public void testFrancMultiplication() throws Exception {
        // given
        Franc franc = new Franc(5);

        // when

        // then
        assertNotEquals(new Franc(5), franc.times(2));
        assertEquals(new Franc(10), franc.times(2));
    }

    @Test
    public void testFrancEquality() throws Exception {
        assertEquals(new Franc(5), new Franc(5));
    }

    @Test
    public void testFrancNonEquality() throws Exception {
        assertNotEquals(new Franc(6), new Franc(5));
    }
}