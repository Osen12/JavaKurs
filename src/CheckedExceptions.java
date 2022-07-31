import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void main(String[] args)  {
        try {
            System.out.println("Before reading file");
            readFile("C:\\Users\\osene\\Desktop\\JavaKurs\\src\\texta.txt");
            System.out.println("Closing file");
        } catch (FileNotFoundException e) {
            System.out.println("Wyjatek zostal wyrzucony");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Closing file finally");
        }

        }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);

    }
}
