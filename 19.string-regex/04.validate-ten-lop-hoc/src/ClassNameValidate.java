import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidate {

    public static final String CLASS_NAME_REGEX  = "^[CAP]\\d{4}[GHIKLM]$";

    public static Pattern pattern_CLASS = Pattern.compile(CLASS_NAME_REGEX);

    public static final String [] validClassName = {"C0318G", "P2014I"};

    public static final  String[] invalidClassName = {"M0318G", "P0323A"};

    public static void main(String[] args) {
        for (String className : validClassName){
            System.out.println(className + " " + Validate(className)  );
        }

        for (String className : invalidClassName){
            System.out.println(className + " " + Validate(className));
        }
    }

    public static boolean Validate(String regex){
        return pattern_CLASS.matcher(regex).matches();
    }
}
