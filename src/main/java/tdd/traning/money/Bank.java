package tdd.traning.money;

import java.util.Hashtable;
import java.util.Map;

public class Bank {

    private final Map<Pair, Integer> rates = new Hashtable<>();

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
