package ch13;

/**
 * A class that can compute the value of an arithmetic expression.
 */
public class Evaluator {
    private final ExpressionTokenizer tokenizer;

    /**
     * Constructs an evaluator
     * @param expression a string containing the expression to be evaluated
     */
    public Evaluator(String expression) {
        tokenizer = new ExpressionTokenizer(expression);
    }

    /**
     * Evaluate the expression.
     * @return the value of the expression
     */
    public int getExpressionValue() {
        int value = getTermValue();
        boolean done = false;
        while (!done) {
            String next = tokenizer.peekToken();
            if ("+".equals(next) || "-".equals(next)) { // `next` could be `null`
                tokenizer.nextToken(); // Discard "+" or "-"
                int value2 = getTermValue();
                if ("+".equals(next)) { value += value2; }
                else { value -= value2; }
            } else {
                done = true;
            }
        }

        return value;
    }

    /**
     * Evaluates the next term found in the expression.
     * @return the value of the term
     */
    public int getTermValue() {
        int value = getFactorValue();
        boolean done = false;
        while (!done) {
            String next = tokenizer.peekToken();
            if ("*".equals(next) || "/".equals(next)) { // `next` could be `null`
                tokenizer.nextToken();
                int value2 = getFactorValue();
                if ("*".equals(next)) { value *= value2; }
                else { value /= value2; }
            } else {
                return value;
            }
        }

        return value;
    }

    /**
     * Evaluates the next factor found in the expression.
     * @return the value of the factor
     */
    public int getFactorValue() {
        int value;
        String next = tokenizer.peekToken();
        if ("(".equals(next)) {
            tokenizer.nextToken(); // Discard "("
            value = getExpressionValue();
            tokenizer.nextToken(); // Discard ")"
        } else {
            value = Integer.parseInt(tokenizer.nextToken());
        }

        return value;
    }
}
