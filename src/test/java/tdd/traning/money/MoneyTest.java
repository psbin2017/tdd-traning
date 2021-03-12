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
        Money money = bank.reduce(sum, Currency.DOLLAR);

        // then
        assertEquals(Money.dollar(20), money);
    }

    @Test
    public void testNotEqualMoney_sumReduce() throws Exception {
        // given
        Expression sum = new Sum(Money.dollar(5), Money.franc(10));
        Bank bank = new Bank();

        // when
        bank.addRate(Currency.FRANC, Currency.DOLLAR, 2);
        Money money = bank.reduce(sum, Currency.DOLLAR);

        // then
        System.out.println(money.toString());
    }

    @Test
    public void testRate_addRate() throws Exception {
        // given
        Bank bank = new Bank();

        // when
        bank.addRate(Currency.DOLLAR, Currency.WON, 2);

        // then
        assertEquals(2, bank.rate(Currency.DOLLAR, Currency.WON));
    }

    @Test
    public void testRate_rateEquality() throws Exception {
        // given
        Bank bank = new Bank();

        // when

        // then
        assertEquals(1, bank.rate(Currency.DOLLAR, Currency.DOLLAR));
    }

}