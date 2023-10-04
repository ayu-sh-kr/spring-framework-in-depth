package dev.archimedes.SpEL;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("'Hello World'");
        String message = expression.getValue().toString();
        System.out.println(message);
    }
}
