import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WorkingWithButtons {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","src/Dreivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("http://www.leafground.com/pages/Link.html");
        driver.findElement(By.partialLinkText("Home Page")).click();
        driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]/a/h5")).click();
        //Find the position
        WebElement position= driver.findElement(By.id("position"));
        Point xy=position.getLocation();
        int x =xy.getX();
        int y = xy.getY();
        System.out.println("Value of X :"+x+"Value of Y :"+y);
       // Find the color of button
        WebElement buttoncolor= driver.findElement(By.id("color"));
        String color=buttoncolor.getCssValue("background-color");
        System.out.println("Button colot is :"+color);

       // Find the size of Button
        WebElement Buttonsize= driver.findElement(By.id("size"));
        int height=Buttonsize.getSize().getHeight();
        int width=Buttonsize.getSize().getWidth();
        System.out.println("Height of the Button is :"+height+"Width of the Button is :"+width);
        Thread.sleep(30000);
        //Go to home page
        WebElement home=driver.findElement(By.id("home"));
        home.click();




    }
}
