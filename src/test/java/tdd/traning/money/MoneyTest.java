package tdd.traning.money;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
    public void testDollarMultiplication() throws Exception {
        // given
        Dollar dollar = new Dollar(5);

        // when
        Dollar product = dollar.times(2);

        // then
        assertNotEquals(10, dollar.getAmount());
        assertEquals(10, product.getAmount());
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