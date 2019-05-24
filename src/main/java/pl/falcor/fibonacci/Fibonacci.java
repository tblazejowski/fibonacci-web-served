package pl.falcor.fibonacci;

class Fibonacci {

    private int inputValue;
    private int result;

    public int getInputValue() {
        return inputValue;
    }

    public int getResult() {
        return result;
    }

    public void setInputValue(int inputValue) {
        this.inputValue = inputValue;
    }

    void countFibonacci() {
        this.result = fibonacci(inputValue);
    }

    private int fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n - 2) + fibonacci(n - 1);
    }
}