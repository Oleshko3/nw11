import java.io.*;
import java.util.Scanner;

/**
 * Created by karoline on 13.7.16.
 */
public class ConsoleReader {

    public static final String FILE_PATH = "output.txt";
    public static final String CHARSET_NAME = "UTF-8";
    public static final boolean IS_APPEND = true;


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
             FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH, IS_APPEND);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, CHARSET_NAME);
             PrintWriter writer = new PrintWriter(outputStreamWriter)) {
            String string = "";
            while (true) {
                string = sc.nextLine();
                if (string.equals("--stop")) {
                    break;
                }
                writer.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
