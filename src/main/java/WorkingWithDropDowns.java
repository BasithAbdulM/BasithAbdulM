import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WorkingWithDropDowns {
    public static void main(String[] args) {
        //System.setProperty("webdriver.ie.driver","src/Dreivers/IEDriverServer.exe");
       // WebDriver driver=new InternetExplorerDriver();
        System.setProperty("webdriver.gecko.driver","src/Dreivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/Link.html");
        driver.findElement(By.linkText("Go to Home Page")).click();
        WebElement DD= driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[5]/a/h5"));
        DD.click();
        //Select training programs using index
        WebElement Finder = driver.findElement(By.id("dropdown1"));
        Select select =new Select(Finder);
        select.selectByIndex(1);

       // Select training programs using visible text
        WebElement visibility = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/select"));
        Select select2=new Select(visibility);
        select2.selectByVisibleText("UFT/QTP");

        // Select training programs using Value
        WebElement value = driver.findElement(By.id("dropdown3"));
        Select select1=new Select(value);
        select1.selectByValue("3");


        //Get the number of dropdown options
        WebElement noofoptions=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/select"));
        Select select3=new Select(noofoptions);
        List<WebElement> Listofoptions=select3.getOptions();
        int size=Listofoptions.size();
        System.out.println("No of options :" +size);

        //Select using sendkeys
        WebElement usingsendkeys=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
        usingsendkeys.sendKeys("Loadrunner");

        //Select Multiple options
        WebElement msb=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
        Select select4=new Select(msb);
        select4.selectByIndex(1);
        select4.selectByValue("3");
        select4.selectByVisibleText("Appium");

    }
}
