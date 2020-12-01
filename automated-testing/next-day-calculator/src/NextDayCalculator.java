import java.net.PortUnreachableException;

public class NextDayCalculator {
    public String nextDayCalculator(String dateStr) {
        String[] date = dateStr.split("/");
        if (date.length != 3) return "Invalid date";
        int day = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int year = Integer.parseInt(date[2]);

        int maxDay = checkMonth(month, year);
        if (++day>maxDay){
           day=1;
            if(++month>12){
                month=1;
                year++;
            }
        }
        return String.format("%d/%d/%d",day,month,year);
    }


    public boolean checkYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }   

    public int checkMonth(int month , int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> checkYear(year) ? 29 : 28;
            default -> -1;
        };
    }

}
