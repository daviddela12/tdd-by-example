package guru.springframework;

public class Dollar extends Money {

    public Dollar(Double amount) {
        super(amount);
        this.setCurrency("USD");
    }

    public Money multiply( Double multiplier ) {
        return new Dollar(this.getAmount() * multiplier);
    }

}
