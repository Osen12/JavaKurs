public class MetodyTest {
    public static void main(String[] args) {

        Metody kalkulator = new Metody();
        /*kalkulator.policzWynik();
        int rezultat = kalkulator.pobierzWynik();
        int resultat2 = rezultat * 2;
        System.out.println("Wynik razy dwa to: " + resultat2);*/

        kalkulator.policzWynikParam(2);
        kalkulator.policzWynikParam(100);
        kalkulator.policzWynikParam(23);


        int result = kalkulator.add(5,9);
        System.out.println("Wynik to: " + result);


        kalkulator.add(2,3);

    }


}
