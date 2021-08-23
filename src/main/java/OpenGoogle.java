import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogle {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","src/Dreivers/chromedriver.exe");
       // System.setProperty("webdriver.gecko.driver","src/Dreivers/geckodriver.exe");
        WebDriver driver=new ChromeDriver();
       // WebDriver driver1=new FirefoxDriver()
        driver.get("http://www.google.co.in");
       // driver1.get("http://www.google.co.in");
        driver.findElement(By.name("q")).sendKeys("Wikipedia"+ Keys.ENTER);
        driver.close();


    }
}
