package tdd.traning.money;

import java.util.Hashtable;
import java.util.Map;

/**
 * Bank 객체의 역할
 * - 화폐의 환율과 연관된 기능을 담당한다.
 * - 환율 테이블 객체를 관리한다.
 */
public class Bank {

    private final Map<Pair, Integer> rates = new Hashtable<>();

    /**
     * 환율을 추가한다.
     * 예시 : 프랑 화폐를 달러 화폐로 바꾸는데 환율은 2 이다.
     *      addRate(Currency.FRANC, Currency.DOLLAR, 2)
     *      2 프랑 : 1 달러
     *
     * @param from 이전 환율
     * @param to 이후 환율
     * @param rate 환율 수치
     */
    public void addRate(Currency from, Currency to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    public Money reduce(Expression source, Currency to) {
        return source.reduce(this, to);
    }

    public int rate(Currency from, Currency to) {
        if ( from.equals(to) ) {
            return 1;
        }
        return rates.get(new Pair(from, to));
    }

}
