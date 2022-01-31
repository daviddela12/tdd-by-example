package guru.springframework.model;

import java.util.Objects;

public class Money {
    private Double amount;

    private String currency;

    public Money(Double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar( Double amount ) {
        return new Money(amount, "USD");
    }

    public static Money franc( Double amount ) {
        return new Money(amount, "CHF");
    }

    public Money multiply( Double multiplier ) {
        return new Money(this.getAmount() * multiplier, this.getCurrency());
    }

    public SumOperation plus(Money money2) {
        return new SumOperation(this, money2);
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Money money = (Money) o;
        if (this.getCurrency() != money.getCurrency()) return false;
        return Objects.equals(amount, money.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
