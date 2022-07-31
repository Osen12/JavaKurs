import drivers.ChromeDriver;
import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ExceptionsExample {
    public static void main(String[] args) {

        /*int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 3;

        for(int i=0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);*/


        WebDriver driver = getDriver("Firefoxw");

        driver.get();
        driver.findElementby();
        driver.findElementby();
        driver.findElementby();
    }


    private static WebDriver getDriver(String name) {
        if (name.equals("Chrome")) {
            return new ChromeDriver();
        } else if (name.equals("Firefox")) {
            return new FirefoxDriver();
        }
        return null;


    }
}