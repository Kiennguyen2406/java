
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FizzBuzzTranslateTest {
    @Test
    void testFizz() {
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzzTranslate.checkFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
     void testBuzz() {
        int number = 5;
        String expected = "Buzz";

        String result = FizzBuzzTranslate.checkFizzBuzz(number);
        assertEquals(expected, result);

    }

    @Test
    void testFizzBuzz() {
        int number = 30;

        String expected = "FizzBuzz";

        String result = FizzBuzzTranslate.checkFizzBuzz(number);
        assertEquals(expected, result);
    }
@Test
 void testNOFizzBuzz(){
    int number=16;

    int expected=number;

    int result= Integer.parseInt(FizzBuzzTranslate.checkFizzBuzz(number));
    assertEquals(expected,result);
}

}
