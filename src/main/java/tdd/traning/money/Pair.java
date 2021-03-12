package tdd.traning.money;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Pair {

    // 이전 통화 종류
    private Currency from;

    // 이후 통화 종류
    private Currency to;

    public Pair(Currency from, Currency to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair pair = (Pair) o;
        return Objects.equals(from, pair.from) && Objects.equals(to, pair.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }
}
