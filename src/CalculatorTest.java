import java.util.Scanner;

public class CalculatorTest {
    public int addition(int firstNumber, int secondNumber) {
        System.out.println("Wynik dodawania to: " + (firstNumber + secondNumber));
        return firstNumber + secondNumber ;
    }

    public int substraction(int firstNumber, int secondNumber) {
        System.out.println("Wynik odejmowania to: " + (firstNumber - secondNumber));
        return firstNumber - secondNumber;
    }
    public int multiplication(int firstNumber, int secondNumber) {
        System.out.println("Wynik mnozenia to: " + (firstNumber * secondNumber));
        return firstNumber * secondNumber;
    }

    public float divsion(float firstNumber, float secondNumber) {
        System.out.println("Wynik dzielenia to: " + (firstNumber / secondNumber));
        return firstNumber / secondNumber;
    }
    public float mod(int firstNumber, int secondNumber) {
        System.out.println("Wynik reszta z dzielenia tych dwoch liczb to: " + (firstNumber % secondNumber));
        return firstNumber % secondNumber;
    }


}

