package guru.springframework;

import java.util.Objects;

public class Dollar {
    private Double amount;

    public Dollar(Double amount) {
        this.amount = amount;
    }

    public Dollar multiply( Double multiplier ) {
        return new Dollar(this.amount * multiplier);
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
        if (o == null || getClass() != o.getClass()) return false;
        Dollar dollar = (Dollar) o;
        return Objects.equals(amount, dollar.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
