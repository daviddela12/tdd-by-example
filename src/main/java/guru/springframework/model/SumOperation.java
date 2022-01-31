package guru.springframework.model;

import java.util.HashMap;

public class SumOperation {
    Money operand1;
    Money operand2;

    public SumOperation(Money operand1, Money operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public Money reduce( String toCurrency ){
        Double result = this.getOperand1().getAmount() + this.getOperand2().getAmount();
        return new Money(result, toCurrency);
    }

    public Money getOperand1() {
        return operand1;
    }

    public void setOperand1(Money operand1) {
        this.operand1 = operand1;
    }

    public Money getOperand2() {
        return operand2;
    }

    public void setOperand2(Money operand2) {
        this.operand2 = operand2;
    }
}
