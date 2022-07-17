import java.util.Scanner;

public class OperatoryLogiczne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int firstInput = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj druga liczbe: ");
        int secondInput = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj trzecia liczbe: ");
        int thirdInput = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Podaj czwarta liczbe: ");
        int fourthInput = scanner3.nextInt();

        boolean firstValue =  firstInput > secondInput;
        boolean secondValue = firstInput < secondInput;
        boolean thirdValue = thirdInput > fourthInput;
        boolean fourthValue = thirdInput < fourthInput;

         // && --> true wtedy gdy wyrazenia skladowe sa rowne true

        System.out.println(firstValue && secondValue);
        System.out.println(firstValue && fourthValue);
        System.out.println(secondValue && thirdValue);

        // || true gdy jedno wyrazenie skladowe jest rowne true
        System.out.println("Jedno jest true: " );

        System.out.println(firstValue || secondValue);
        System.out.println(firstValue || fourthValue);
        System.out.println(secondValue || thirdValue);

        // ! negacja - zwraca wartosc przeciwna do wyazenia przed ktorym sie znajduje

        System.out.println(!firstValue);
        System.out.println((!thirdValue));

        System.out.println(!(firstValue && secondValue)); // true bo wykrzyknik przed w nawiasie

    }
}
