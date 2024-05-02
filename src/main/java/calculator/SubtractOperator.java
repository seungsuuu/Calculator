package main.java.calculator;

public class SubtractOperator<T extends Number>  implements Operator<T> {

    public final Class<T> type;

    public SubtractOperator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T operator(T num1, T num2) {
        double result = num1.doubleValue() - num2.doubleValue();
        return NumberConversionUtils.convertNumberToType(result, type);
    }
}
