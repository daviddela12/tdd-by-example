package guru.springframework.model;

import java.util.HashMap;

public class Bank {

    private HashMap<PairCurrency, Double> rates;

    public Bank() {
        this.rates = new HashMap<>();
    }

    public Money reduce(SumOperation sumOperation, String toCurrency ){
        SumOperation sumOperationAfterExchange = this.exchangeOperation(sumOperation, toCurrency);
        return sumOperationAfterExchange.reduce(toCurrency);
    }

    private SumOperation exchangeOperation(SumOperation sumOperation, String toCurrency) {
        Money operation1AfterExchange = this.exchangeOperationElement( sumOperation.getOperand1(), toCurrency);
        Money operation2AfterExchange = this.exchangeOperationElement( sumOperation.getOperand2(), toCurrency);
        return new SumOperation(operation1AfterExchange, operation2AfterExchange);
    }

    private Money exchangeOperationElement( Money operation, String toCurrency ) {
        PairCurrency pairOperation = new PairCurrency(operation.getCurrency(), toCurrency);
        Double amount = operation.getAmount() * this.getRateValue(pairOperation);
        return new Money( amount, toCurrency);
    }

    public void addRate( String from, String to, Double value) {
        PairCurrency rate = new PairCurrency(from, to);
        rates.put(rate, value);
    }

    public Double getRateValue(PairCurrency rate) {
        if (this.getRates().get(rate) == null) {
            return 1d;
        }
        return this.getRates().get(rate).doubleValue();
    }

    public HashMap<PairCurrency, Double> getRates() {
        return rates;
    }

    public void setRates(HashMap<PairCurrency, Double> rates) {
        this.rates = rates;
    }
}
