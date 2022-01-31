package guru.springframework;

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
}
