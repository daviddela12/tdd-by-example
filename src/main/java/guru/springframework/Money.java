package guru.springframework;

import java.util.Objects;

public abstract class Money {
    private Double amount;

    public Money(Double amount) {
        this.amount = amount;
    }

    public static Money dollar( Double amount ) {
        return new Dollar(amount);
    }

    public static Money franc( Double amount ) {
        return new Franc(amount);
    }

    abstract public Money multiply( Double multiplier );

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Objects.equals(amount, money.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
