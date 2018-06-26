/**
 * Created by user on 25.06.2018.
 */

import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String text = "i love you jaaaaaavaaaaa what this coooooooooooooll";
        ZipText zipText = new ZipText(text);
        zipText.zip();
    }
}
