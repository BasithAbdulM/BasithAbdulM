import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAlerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/Dreivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Link.html");

        WebElement home = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/a"));
        home.click();

        WebElement alertbox=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[9]/a/h5"));
        alertbox.click();

        //Display a alertbox
        WebElement alert1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
        alert1.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

        //Display a confirmbox
        WebElement confirm= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
        confirm.click();
        Alert confirmalert=driver.switchTo().alert();
        confirmalert.dismiss();

        //Display a prompt box
        WebElement prompt = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
        prompt.click();
        Alert promptalert=driver.switchTo().alert();
        promptalert.sendKeys("Alert Practice");
        String pa=promptalert.getText();
        System.out.println("Text Given :"+pa);
        promptalert.accept();

        //sweetalert
        WebElement swalert= driver.findElement(By.xpath("//*[@id=\'btn\']"));
        swalert.click();
        Alert sweetalert=driver.switchTo().alert();
        sweetalert.accept();




    }
}
