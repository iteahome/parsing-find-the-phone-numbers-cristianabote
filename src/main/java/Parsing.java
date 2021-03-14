import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parsing {

    public static void main(String[] args) {
        /* Considering the below text please find using only one regex all phone numbers in this format:
07xx-xxxxxx
(07xx)-xxxxx
07xx xxx xxx
07xx xxx-xxx
07xx-xxx-xxx
The text where you have to find the phone numbers is:
"0832 973213 ada 074o-123 312 0721 912 123 123 321 212 0732-222111(7480)-732213 0932-213-231(0732)-1321220749 223-102a0792-010-110" */

        String myString = "0832 973213 ada 074o-123 312 0721 912 123 123 321 212 0732-222111(7480)-732213 0932-213-231(0732)-1321220749 223-102a0792-010-1100";

        String theRegex = "\\(?07\\d{2}\\)?[\\s-]\\d{3}[\\s-]?\\d{3}";


        Pattern checkRegex = Pattern.compile(theRegex);
        Matcher regexMatcher = checkRegex.matcher(myString);

        for (int counter = 0; regexMatcher.find(); counter++)
            if (regexMatcher.group().length() != 0)
                System.out.println("numar existent in sirul dorit:" + regexMatcher.group());
    }
}