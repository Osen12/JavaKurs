public class PracaDomowa3 {
    public static void main(String[] args) {
        System.out.println("Zadanie 1:");
        System.out.println("");

        for (int i = 1; i < 20; i++) {
            if (i % 3 == 0)
                System.out.println("Liczba jest podzielna przez 3: " + i);
        }

        System.out.println("");
        System.out.println("Zadanie 2:");
        System.out.println("");

        int[] cyfry = new int[] {1,2,5,8,9,100,1000};

        int dlugosc = cyfry.length - 1;

        for (int i = dlugosc; i > -1; i-- ) {
            System.out.println(cyfry[i]);

        }
    }
}