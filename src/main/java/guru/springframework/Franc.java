package guru.springframework;

public class Franc extends Money {

    public Franc(Double amount) {
        super(amount);
    }

    public Money multiply( Double multiplier ) {
        return new Franc(this.getAmount() * multiplier);
    }
}
