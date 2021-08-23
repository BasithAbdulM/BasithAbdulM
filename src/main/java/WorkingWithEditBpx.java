import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WorkingWithEditBpx {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "src/Dreivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("http://www.leafground.com/pages/Link.html");
        //Working with partial link text
        driver.findElement(By.partialLinkText(" Home Page")).click();
        driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/h5")).click();
        //Enter your email
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("abc.123@gmail.com");
        //Append a text
        WebElement append = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
        append.sendKeys("qwerty");
        //Get the text
        WebElement gettext = driver.findElement(By.name("username"));
        String val = gettext.getAttribute("value");
        System.out.println(val);
        //Clear the text
        WebElement cleartext = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
        cleartext.clear();
        //Is the text disabled or not
        WebElement disabled = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
        boolean enabled = disabled.isEnabled();
        System.out.println(enabled);

    }

}
