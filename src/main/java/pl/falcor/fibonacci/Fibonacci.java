package pl.falcor.fibonacci;

class Fibonacci {

    private int inputValue;
    private long result;

    public int getInputValue() {
        return inputValue;
    }

    public long getResult() {
        return result;
    }

    public void setInputValue(int inputValue) {
        this.inputValue = inputValue;
    }

    void countFibonacci() {
        this.result = fibonacci(inputValue);
    }

    private long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n - 2) + fibonacci(n - 1);
    }
}