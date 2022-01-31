package guru.springframework;

public class Dollar {
    public Double amount;

    public Dollar(Double amount) {
        this.amount = amount;
    }

    public void multiply( Double multiplier ) {
        this.amount *= multiplier;
    }
}
