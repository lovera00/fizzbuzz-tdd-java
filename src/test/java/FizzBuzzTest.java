import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testNumberIsOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.convert(1));
    }
    @Test
    public void testNumberIsTwo() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.convert(2));
    }
    @Test
    public void testNumberIsThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.convert(3));
    }

}
