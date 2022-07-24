public class UserTest {
    public static void main(String[] args) {


        //User user = new User();

        User user = new User("Chuju","Czesc");

        //user.username = "Kindybal";
        //user.password = "Haslo";
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
    }
}
