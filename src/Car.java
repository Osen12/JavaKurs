public class Car {

        public String marka;
        public String model;
        public int rocznik;
        public int przebieg;

        public Car(String marka, String model, int rocznik, int przebieg){
            this.marka = marka;
            this.model = model;
            this.rocznik = rocznik;
            this.przebieg = przebieg;

        }

        public void informacje(){
            System.out.println("Marka samochodu: " + marka);
            System.out.println("Model samochodu: " + model);
            System.out.println("Rocznik samochodu: " + rocznik);
            System.out.println("PRzebieg samochodu: " + przebieg);
        }



}


