package jUnitAndMockito;

class Calculator {
    private CalculatorEngine engine;

    public Calculator(CalculatorEngine engine) {
        this.engine = engine;
    }

    public String divide(int a, int b) {
        String result = "";
        int engineResult = 0;
        try {
            engineResult = engine.divide(a, b);
        } catch (ArithmeticException e) {
            result = "by zero is prohibited";
        }
        if ("".equals(result)) {
            result = String.format("of %d by %d = %d",a,b, engineResult);
        }
        return "Division " + result;
    }
}