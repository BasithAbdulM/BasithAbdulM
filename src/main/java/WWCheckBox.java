import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WWCheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","src/Dreivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/Link.html");
        driver.findElement(By.linkText("Go to Home Page")).click();
        WebElement cb=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[7]/a/h5"));
        cb.click();

        //select language you know
        WebElement pl= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
        pl.click();

        //Conform if checked
        WebElement checked = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/input"));
        boolean status=checked.isSelected();
        System.out.println(status);

        //Deselect
        WebElement first= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[1]/input"));
        if (first.isSelected()){
            first.click();
        }
        WebElement second = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[2]/input"));
        if (second.isSelected()){
            second.click();
        }

        //select all
        WebElement option1 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[1]/input"));
        WebElement option2 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[2]/input"));
        WebElement option3 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[3]/input"));
        WebElement option4 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[4]/input"));
        WebElement option5 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[5]/input"));
        option1.click();
        option2.click();
        option3.click();
        option4.click();
        option5.click();


    }
}
