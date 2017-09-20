import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Lab3 {
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
    public static void main(String[] args) {
        String text = urlToString("http://erdani.com/tdpl/hamlet.txt");
        System.out.println(text);
        int count = 1;
        for (int i=0;i<=text.length()-1;i++)
        {
            if (text.charAt(i) == ' ' && text.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }

}
