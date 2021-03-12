package tdd.traning.money;

public interface Expression {
    Money reduce(Bank bank, Currency to);
}
