import java.util.Scanner;

public class PracaDomowa1Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int firstNumber = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj druga liczbe: ");
        int secondNumber = scanner2.nextInt();

        int suma = firstNumber + secondNumber;
        int mnozenie = firstNumber * secondNumber;
        int odejmowanie = firstNumber - secondNumber;

        System.out.println("Wynik dodawania to: " + suma );
        System.out.println("Wynik mnozenia to: " + mnozenie);
        System.out.println("Wynik odejmowania to: " + odejmowanie);


    }
}
