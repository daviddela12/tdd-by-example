package guru.springframework;

public class Franc extends Money {

    public Franc(Double amount) {
        super(amount, "CHF");
    }

    public Money multiply( Double multiplier ) {
        return Money.franc(this.getAmount() * multiplier);
    }
}
