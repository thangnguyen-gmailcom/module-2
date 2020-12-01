import java.io.UncheckedIOException;

public class AbsoluteNumberCalculator {

    public static int findAbsolute(int number) {
        if(number < 0)
            return -number;
        return number;
    }
}
