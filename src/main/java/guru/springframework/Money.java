package guru.springframework;

import java.util.Objects;

public class Money {
    private Double amount;

    public Money(Double amount) {
        this.amount = amount;
    }

    public Money multiply( Double multiplier ) {
        return new Money(this.amount * multiplier);
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || (getClass() != o.getClass() && o.getClass().isAssignableFrom(getClass()) && getClass().isAssignableFrom(o.getClass()))) return false;
        Money money = (Money) o;
        return Objects.equals(amount, money.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
