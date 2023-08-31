import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testNumberIsOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.convert(1));
    }
}
