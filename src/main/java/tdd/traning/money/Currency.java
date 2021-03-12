package tdd.traning.money;

import lombok.Getter;

@Getter
public enum Currency {

    DOLLAR("USD"),
    FRANC("CHF"),
    WON("원");

    private final String currency;

    Currency(String currency) {
        this.currency = currency;
    }
}
