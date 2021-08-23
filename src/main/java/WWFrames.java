import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class WWFrames {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "src/Dreivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("http://www.leafground.com/pages/Link.html");
        //Working with partial link text
        driver.findElement(By.partialLinkText(" Home Page")).click();



        //WWFRAMES
        WebElement frames= driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[10]/a/h5"));
        frames.click();
//Working with iframe
        //switch to frames
        driver.switchTo().frame(0);

        WebElement frame1= driver.findElement(By.id("Click"));
        frame1.click();
        String textafterclicking=driver.findElement(By.id("Click")).getText();
        System.out.println("Text After Clicking: "+textafterclicking);
//Working with nested Frame
        //bring back control to original content
        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        driver.switchTo().frame("frame2");
        WebElement frame2=driver.findElement(By.id("Click1"));
        frame2.click();
        String afterclicking=driver.findElement(By.id("Click1")).getText();
        System.out.println("Text After Clicking: "+afterclicking);

//Find the number of frames present

      //bring back control to original content
      driver.switchTo().defaultContent();

      //Find the number of frames present
       List<WebElement> totalframes= driver.findElements(By.tagName("iframe"));
       int sizes=totalframes.size();
        System.out.println(sizes);

    }
}
