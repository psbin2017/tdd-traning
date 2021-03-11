package tdd.traning.money;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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

}