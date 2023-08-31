public class FizzBuzz {
    public String convert(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(number);
    }

}
