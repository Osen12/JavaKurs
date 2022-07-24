package drivers;

import drivers.ChromeDriver;

public class WebDriverTest {
    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get();
        chromeDriver.findElementby();

        System.out.println("");

        FirefoxDriver firefoxDriver = new FirefoxDriver();

        firefoxDriver.get();
        firefoxDriver.findElementby();
    }
}
