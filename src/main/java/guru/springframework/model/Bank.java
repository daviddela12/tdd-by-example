package guru.springframework.model;

public class Bank {

    public Money reduce( SumOperation sumOperation, String toCurrency ){
        //TODO possible exxchange currencies
        return sumOperation.reduce(toCurrency);
    }
}
