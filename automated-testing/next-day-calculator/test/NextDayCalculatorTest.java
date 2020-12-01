import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    void nextDayCalculator() {
        String dateStr = "1/1/2018";

        String excepted = "2/1/2018";
        NextDayCalculator calculator = new NextDayCalculator();
        String result = calculator.nextDayCalculator(dateStr);

        assertEquals(excepted,result);
    }

    @org.junit.jupiter.api.Test
    void nextDayCalculator1() {
        String dateStr = "31/1/2018";

        String excepted = "1/2/2018";
        NextDayCalculator calculator = new NextDayCalculator();
        String result = calculator.nextDayCalculator(dateStr);

        assertEquals(excepted,result);
    }

    @org.junit.jupiter.api.Test
    void nextDayCalculator2() {
        String dateStr = "30/4/2018";

        String excepted = "1/5/2018";
        NextDayCalculator calculator = new NextDayCalculator();
        String result = calculator.nextDayCalculator(dateStr);

        assertEquals(excepted,result);
    }

    @org.junit.jupiter.api.Test
    void nextDayCalculator3() {
        String dateStr = "28/2/2018";

        String excepted = "1/3/2018";
        NextDayCalculator calculator = new NextDayCalculator();
        String result = calculator.nextDayCalculator(dateStr);

        assertEquals(excepted,result);
    }

    @org.junit.jupiter.api.Test
    void nextDayCalculator4() {
        String dateStr = "29/2/2019";

        String excepted = "1/3/2019";
        NextDayCalculator calculator = new NextDayCalculator();
        String result = calculator.nextDayCalculator(dateStr);

        assertEquals(excepted,result);
    }

    @org.junit.jupiter.api.Test
    void nextDayCalculator5() {
        String dateStr = "31/12/2019";

        String excepted = "1/1/2020";
        NextDayCalculator calculator = new NextDayCalculator();
        String result = calculator.nextDayCalculator(dateStr);

        assertEquals(excepted,result);
    }
}