package Calculator;

public class Addition implements Calculator {

    @Override
    public double operate(double a, double b) {
        return a + b;
    }
}
