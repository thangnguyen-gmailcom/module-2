import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {

    public static final String STRING_REGEX = "name_song\">(.*?)</a>";
    static Pattern songPattern = Pattern.compile(STRING_REGEX);

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));

            StringBuilder content = new StringBuilder();
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine());
            }
            scanner.close();
            String formatted = content.toString().replaceAll("\\n+", " ");
            System.out.println(formatted);
            Matcher matcher = songPattern.matcher(formatted);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
