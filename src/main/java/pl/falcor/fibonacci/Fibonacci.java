package pl.falcor.fibonacci;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
class Fibonacci {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private int inputValue;
    private long result;

    protected Fibonacci() {
    }

    public int getInputValue() {
        return inputValue;
    }

    public long getResult() {
        return result;
    }

    public void setInputValue(int inputValue) {
        this.inputValue = inputValue;
    }

    public void setResult(long result) {
        this.result = result;
    }

    void countFibonacci() {
        this.result = fibonacci(inputValue);
    }

    private long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n - 2) + fibonacci(n - 1);
    }
}