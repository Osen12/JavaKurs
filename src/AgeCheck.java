import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj swoj wiek: ");
        int wiek = input.nextInt();

        if (wiek >= 18) {
            System.out.println("Zyczymy udanych zakupow!");
        } else if (wiek <= 0){
            System.out.println("Wartosc nieprawidlowa!");
        } else {
            System.out.println("Musisz miec co najmniej 18 lat by zrobic zakupy");
        }

    }
}
