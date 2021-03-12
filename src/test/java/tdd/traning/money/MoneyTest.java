package tdd.traning.money;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
    public void testMoneyEquality() throws Exception {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(6), new Dollar(5));
        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(6), new Franc(5));
    }

}