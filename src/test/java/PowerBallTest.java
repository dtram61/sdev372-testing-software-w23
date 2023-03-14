import org.junit.jupiter.api.RepeatedTest;
import random.PowerBall;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PowerBallTest {
    @RepeatedTest(5)
    public void testRange()
    {
        PowerBall powerBall = new PowerBall();
        int[] numbers = powerBall.getNumbers();

        // verify that the first five are in the range [1,69]
        for (int i = 0; i < 5 ; i++) {

            checkRange(1,69, numbers[i]);

        }

        // verify the sixth number is in the range [1,26]

        checkRange(1,26, numbers[5]);
    }

    private void checkRange(int low, int high, int value)
    {
        assertTrue(value >= 1);
        assertTrue(value <= 69);

    }
}
