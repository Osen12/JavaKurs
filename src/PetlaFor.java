public class PetlaFor {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i = i+2) {
            System.out.println(i);
        }

        for (int i = 0; i < 100; i++){
            if(i%5==0){
                System.out.println("Liczba jest podzielna przez 5: " + i);
            }
        }


    }
}
