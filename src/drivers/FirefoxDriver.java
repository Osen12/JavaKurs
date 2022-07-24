package drivers;

import drivers.WebDriver;

public class FirefoxDriver implements WebDriver {

    @Override
    public void get() {
        System.out.println("Otwieram przegladarke za pomoca Firefox");
    }

    @Override
    public void findElementby() {
        System.out.println("Znajduje element za pomoca przegladarki Firefox");
    }
}




