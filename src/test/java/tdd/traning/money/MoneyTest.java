package tdd.traning.money;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoneyTest {

    @Test
    public void testEqualMoney_sumReduce() throws Exception {
        // given
        Expression sum = new Sum(Money.dollar(10), Money.dollar(10));
        Bank bank = new Bank();

        // when
        Money money = bank.reduce(sum, "USD");

        // then
        assertEquals(Money.dollar(20), money);
    }

}