package tdd.traning.money;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrancTest {

    @Test
    public void testFranc_times() throws Exception {
        // given
        Money franc = Money.franc(5);

        // when

        // then
        assertNotEquals(Money.franc(5), franc.times(2));
        assertEquals(Money.franc(10), franc.times(2));
    }

    /**
     * 삼각 측량법을 사용 테스트
     */
    @Test
    public void testFranc_equals() throws Exception {
        assertNotEquals(Money.franc(6), Money.franc(5));
        assertEquals(Money.franc(5), Money.franc(5));
    }

}