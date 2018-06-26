import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 26.06.2018.
 */
public class ZipText {
    String text;

    public ZipText(String text) {
        this.text = text;
    }

    public void zip() {
        int numberDublicate = 0;
        String zipText = "";
        String[] textString = text.split("");
        for (int j = 0; j < textString.length; j++) {
            zipText = zipText + textString[j];
            for (int i = j + 1; i < textString.length; i++) {
                Pattern char1 = Pattern.compile(String.valueOf(textString[j].charAt(0)));
                Matcher master = char1.matcher(String.valueOf(textString[i].charAt(0)));
                if (master.matches()) {

                    numberDublicate++;
                    if (i == textString.length - 1) {
                        zipText = zipText + numberDublicate;
                        numberDublicate = 0;
                        j = i;

                    }
                } else {
                    if (numberDublicate != 0) zipText = zipText + numberDublicate;
                    numberDublicate = 0;
                    j = i - 1;
                    break;
                }
            }
        }
        System.out.println(zipText);
    }
}
