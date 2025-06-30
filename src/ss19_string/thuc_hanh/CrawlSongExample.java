package ss19_string.thuc_hanh;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/playlist/hit-viet-quoc-dan-various-artists.fb7YDyfASno0.html?st=2");
            Scanner sc = new Scanner(new InputStreamReader(url.openStream()));
            sc.useDelimiter("\\Z");
            String content = sc.next();

            sc.close();

            content = content.replaceAll("\\n+", "");

            Pattern pattern = Pattern.compile("titleplay=\"(.*?)\"");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
