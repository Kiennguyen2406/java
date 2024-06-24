import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
   @Test
   void case1(){
       int day=1;
       int month=1;
       int year=2018;
       String expected="2-1-2018";

       NextDayCalculator date = new NextDayCalculator(day, month, year);
       date.nextDay();

       String actual = date.toString();

       assertEquals(expected,actual);
   }

    @Test
    void case2(){
        int day=31;
        int month=1;
        int year=2018;
        String expected="1-2-2018";

        NextDayCalculator date = new NextDayCalculator(day, month, year);
        date.nextDay();

        String actual = date.toString();

        assertEquals(expected,actual);
    }

}