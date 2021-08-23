import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WWRadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/Dreivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Link.html");

        WebElement home = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/a"));
        home.click();

        WebElement radiobutton= driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[6]/a/h5"));
        radiobutton.click();

        //Select age group
        // check whether it is unchecked or not
        WebElement unchecked= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[2]/input"));
        WebElement checked= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[3]/input"));

        boolean select1=unchecked.isSelected();
        boolean select2= checked.isSelected();
        System.out.println(select1);
        System.out.println(select2);

        //Select age group
        WebElement above40= driver.findElement(By.name("age"));
        above40.click();



    }
}
