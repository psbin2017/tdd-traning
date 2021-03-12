package tdd.traning.money;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
    public void testMoneyEquality() throws Exception {
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(6), Money.dollar(5));
        assertEquals(Money.franc(5), Money.franc(5));
        assertNotEquals(Money.franc(6), Money.franc(5));
    }

    @Test
    public void testReduceSum() throws Exception {
        // given
        Expression sum = new Sum(Money.dollar(10), Money.dollar(10));
        Bank bank = new Bank();

        // when
        Money money = bank.reduce(sum, "USD");

        // then
        assertEquals(Money.dollar(20), money);
    }

}