package drivers;

public class ChromeDriver implements WebDriver {


    @Override
    public void get() {
        System.out.println("Otwieram przegladarke za pomoca Chrome");
    }

    @Override
    public void findElementby() {
        System.out.println("Znajduje element za pomoca przegladarki Chrome");
    }
}
