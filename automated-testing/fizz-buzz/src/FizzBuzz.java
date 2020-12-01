public class FizzBuzz {
    private final String[] STR = {"", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin"};

    public String checkFizzBuzz(int number) {
        if (number < 0 || number > 100) return "fail";
        boolean fizz = number % 3 == 0;
        boolean buzz = number % 5 == 0;

        if (fizz && buzz) return "FizzBuzz";
        if (fizz) return "Fizz";
        if (buzz) return "Buzz";
        return getStringNumber(number);

    }

    public String getStringNumber(int number) {
        int unit = number % 10;
        int dozens = number / 10;

        return ((dozens == 1 ? "muoi" : STR[dozens]) + " " + STR[unit]);
    }
}
