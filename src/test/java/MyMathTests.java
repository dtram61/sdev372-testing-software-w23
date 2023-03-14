
import math.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyMathTests {
    @Test
    public void exceptionsTest()
    {
        MyMath calculator = new MyMath();
        assertThrows(ArithmeticException.class, () -> calculator.divide(219,0));
    }

    @Test
    public void divideTest()
    {
        MyMath calculator = new MyMath();
        assertDoesNotThrow(() -> calculator.divide(219,21));
    }
}
