import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int firstNumber = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj druga liczbe: ");
        int secondNumber = scanner2.nextInt();

        CalculatorTest calculator = new CalculatorTest();

        calculator.addition(firstNumber,secondNumber);
        calculator.substraction(firstNumber,secondNumber);
        calculator.divsion(firstNumber,secondNumber);
        calculator.multiplication(firstNumber,secondNumber);
        calculator.mod(firstNumber,secondNumber);






    }
}
