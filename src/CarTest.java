public class CarTest {
    public static void main(String[] args) {

        Car car = new Car("Mercedes","Klasa S", 2020, 10000);
        Car car1 = new Car("Audi","TT", 1990, 200222);
        Car car2 = new Car("Porsche", "Cayenne", 2001, 159878);

        car.informacje();
        System.out.println(" ");
        car1.informacje();
        System.out.println(" ");
        car2.informacje();

    }

}
