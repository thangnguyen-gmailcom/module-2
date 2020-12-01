import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void checkFizzBuzz() {
        int number = 5;

        String expected = "Buzz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.checkFizzBuzz(number);
        assertEquals(result,expected);
    }

    @org.junit.jupiter.api.Test
    void checkFizzBuzz1() {
        int number = 3;

        String expected = "Fizz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.checkFizzBuzz(number);
        assertEquals(result,expected);
    }

    @org.junit.jupiter.api.Test
    void checkFizzBuzz2() {
        int number = 15;

        String expected = "FizzBuzz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.checkFizzBuzz(number);
        assertEquals(result,expected);
    }

    @org.junit.jupiter.api.Test
    void checkFizzBuzz3() {
        int number = -1;

        String expected = "fail";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.checkFizzBuzz(number);
        assertEquals(result,expected);
    }

    @org.junit.jupiter.api.Test
    void checkFizzBuzz4() {
        int number = 13;

        String expected = "muoi ba";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.checkFizzBuzz(number);
        assertEquals(result,expected);
    }
}