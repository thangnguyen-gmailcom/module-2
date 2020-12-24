import java.util.regex.Pattern;

public class ValidatePhoneNumber {

    public static final String PHONE_NUMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public static final Pattern phoneNumberPattern = Pattern.compile(PHONE_NUMBER_REGEX);

    public static final String[] validPhoneNumber = {"(84)-(0978489648)" , "(84)-(0973496048)"};

    public static final String[] invalidPhoneNumber = {"(a8)-(22222222)", "(84)-(22222222)"};

    public static boolean validate(String regex){
        return phoneNumberPattern.matcher(regex).matches();
    }

    public static void main(String[] args) {

        for (String phoneNumber : validPhoneNumber){
            System.out.println(phoneNumber + " " + validate(phoneNumber));
        }

        for (String phoneNumber : invalidPhoneNumber){
            System.out.println(phoneNumber + " " + validate(phoneNumber));
        }
    }
}
