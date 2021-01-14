import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {

    Scanner scanner = new Scanner(System.in);

    private String dateRegex = "^[0-3]?[0-9].[0-3]?[0-9].(?:[0-9]{2})?[0-9]{2}$";

    public boolean checkDate(String date) {
        if (date == null || !date.matches(dateRegex)) {
            return false;
        }
        String[] dat = date.split("-");
        if (Integer.parseInt(dat[2]) > 2002 || Integer.parseInt(dat[2]) < 1990) {
            return false;
        }
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        df.setLenient(false);
        try {
            df.parse(date);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String validDate(String message) {
        System.out.println(message);
        String date = scanner.nextLine();
        try {
            if (checkDate(date)) {
                return date;
            } else {
                System.out.println("Không đúng định dạng. Xin nhập lại !");
                System.out.println("Ví dụ : 15-12-2000");
                return validDate(message);
            }
        } catch (Exception e) {
            System.out.println("Không đúng định dạng. Xin nhập lại !");
            System.out.println("Ví dụ : 15-12-2000");
            return validDate(message);
        }
    }

    public boolean checkName(String name) {
        String regex = "[\\pL\\pZ]{2,20}";
        Pattern patternName = Pattern.compile(regex);
        if (patternName.matcher(name).find()) {
            return true;
        } else {
            return false;
        }
    }

    public String validName(String message) {
        System.out.println(message);
        String name = scanner.nextLine();
        try {
            if (checkName(name)) {
                return name;
            } else {
                System.out.println("Không đúng định dạng. Xin nhập lại !");
                System.out.println("Ví dụ : thang");
                return validName(message);
            }
        } catch (Exception e) {
            System.out.println("Không đúng định dạng. Xin nhập lại !");
            System.out.println("Ví dụ : thang");
            return validName(message);
        }
    }

    public String validGender(String message) {
        try {
            System.out.println(message);
            String gender = scanner.nextLine().replaceAll(" ", "");
            String formatGender = gender.substring(0, 1).toUpperCase() + gender.substring(1).toLowerCase();
            if ((formatGender.equals("Nam")) || (formatGender.equals("Nu"))) {
                return formatGender;
            } else {
                System.out.println("Không đúng định dạng. Xin nhập lại !");
                System.out.println("ví dụ : Nam || Nu");
                return validGender(message);
            }
        } catch (Exception ex) {
            System.out.println("Không đúng định dạng. Xin nhập lại !");
            System.out.println("Ví dụ : Nam || Nu");
            return validGender(message);
        }
    }

    public int validInteger(String message) {
        int num;
        System.out.println(message);
        try {
            num = Integer.parseInt(scanner.nextLine());
            if (num > 0) {
                return num;
            } else {
                System.out.println("Số nhập vào nằm ngoài giới hạn !");
                return validInteger(message);
            }
        } catch (Exception e) {
            System.out.println("Số nhập vào nằm ngoài giới hạn !");
            return validInteger(message);
        }
    }

    public int validChoice(String message, int lowerLimit, int upperLimit) {
        int num;
        System.out.println(message);
        try {
            num = Integer.parseInt(scanner.nextLine());
            if (num >= lowerLimit && num <= upperLimit) {
                return num;
            } else {
                System.out.println("Số nhập vào nằm ngoài giới hạn !");
                return validChoice(message, lowerLimit, upperLimit);
            }
        } catch (Exception e) {
            System.out.println("Số nhập vào nằm ngoài giới hạn !");
            return validChoice(message, lowerLimit, upperLimit);
        }
    }

    public Double validPoints(String message) {
        Double points;
        System.out.println(message);
        try {
            points = Double.parseDouble(scanner.nextLine());
            if (points >= 0 && points <= 10) {
                return points;
            } else {
                System.out.println("điểm đã nhập không hợp lệ !");
                System.out.println("phải nhập điểm trong khoảng 0 - 10");
                return validPoints(message);
            }
        } catch (Exception e) {
            System.out.println("điểm đã nhập không hợp lệ !");
            System.out.println("phải nhập điểm trong khoảng 0 - 10");
            return validPoints(message);
        }
    }

    public String yesNo() {
        while (true) {
            System.out.println("Nhập sự lựa chọn của bạn : ");
            String n = scanner.nextLine().trim().toUpperCase();
            if (n.equalsIgnoreCase("N") || n.equalsIgnoreCase("Y")) {
                return n;
            } else {
                System.out.print("Lựa chọn sai. Xin nhập lại ! ");
            }
        }
    }
}
