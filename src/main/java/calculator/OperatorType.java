package main.java.calculator;

public enum OperatorType {
    ADDITION('+'),
    SUBTRACTION('-'),
    MULTIPLICATION('*'),
    DIVISION('/'),
    MODULO('%');

    private final char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public static OperatorType fromOperator(char operator) {
        for (OperatorType type : OperatorType.values()) {
            if (type.symbol == operator) {
                return type;
            }
        }
        throw new IllegalArgumentException("해당 연산자가 없습니다." + operator);
    }
}
