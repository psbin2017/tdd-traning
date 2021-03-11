package tdd.traning.money;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    public void testDollarMultiplication() throws Exception {
        // given
        Dollar dollar = new Dollar(5);

        // when
        dollar.times(2);

        // then
        assertEquals(10, dollar.getAmount());
    }

}