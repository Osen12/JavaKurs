public class User {
    public String username;
    public String password;


    public User(String username, String password){
        System.out.println("Siema z konstruktora");
        this.username = username;
        this.password = password;
    }

    public void sayHello(){
        System.out.println("Mam na imie: " + username);
    }
}
