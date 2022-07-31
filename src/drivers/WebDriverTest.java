package drivers;

import drivers.ChromeDriver;

public class WebDriverTest {
    public static void main(String[] args) throws NoValidBrowserName {

        WebDriver driver = getDriver("Firefoxa");

        driver.get();
        driver.findElementby();
        driver.findElementby();
        driver.findElementby();


        System.out.println("");

        /*FirefoxDriver firefoxDriver = new FirefoxDriver();

        firefoxDriver.get();
        firefoxDriver.findElementby();*/
    }

    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if(name.equals("Chrome")) {
            return new ChromeDriver();
        } else if (name.equals("Firefox")) {
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("No valid browser name");

    }


}
