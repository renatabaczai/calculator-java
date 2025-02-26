import org.junit.jupiter.api.Test;
import javax.script.*;

class CalculatorTest {

    private float evaluateExpression(String expression) throws ScriptException {
        return ((Number) new ScriptEngineManager()
                .getEngineByName("JavaScript")
                .eval(expression)).floatValue();
    }

    @Test
    void testBasicOperations() throws ScriptException {
        System.out.println(evaluateExpression("2 + 3"));
        System.out.println(evaluateExpression("10 - 4"));
        System.out.println(evaluateExpression("3 * 4"));
        System.out.println(evaluateExpression("10 / 2"));
    }

    @Test
    void testParentheses() throws ScriptException {
        System.out.println(evaluateExpression("2 + (3 * 4)"));
        System.out.println(evaluateExpression("(2 + 3) * 4"));
    }
}

