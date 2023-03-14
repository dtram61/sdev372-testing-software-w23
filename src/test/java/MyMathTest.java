
import math.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyMathTest {
    @Test
    public void testExceptions()
    {
        MyMath calculator = new MyMath();
        assertThrows(ArithmeticException.class, () -> calculator.divide(219,0));
    }

    @Test
    public void testDivide()
    {
        MyMath calculator = new MyMath();
        assertDoesNotThrow(() -> calculator.divide(219,21));
    }
}
