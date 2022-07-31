import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class ExceptionCheck {
    public static void main(String[] args) throws InvalidAgeException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj wiek: ");
        int wiek = scanner.nextInt();

        if (wiek <= 0){
            throw new InvalidAgeException("Zly wiek");
        } else if (wiek < 18) {
            System.out.println("Zajebiscie");
        } else  {
            System.out.println("Jestes pelnoletni");

        }



        }
    }