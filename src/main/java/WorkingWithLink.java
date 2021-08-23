import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithLink {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","src/Dreivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/Link.html");
        driver.findElement(By.linkText("Go to Home Page")).click();


    }
}
