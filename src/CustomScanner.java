import java.util.Scanner;

public class CustomScanner {
    public static void main(String[] args) {

    /*    Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String name = scanner.nextLine();
        System.out.println("Czesc " + name + "!");
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int firstnumber = scanner.nextInt();
        int result = firstnumber * firstnumber;
        System.out.println("Kwadrat tej liczby to: " + result);
    }
}
