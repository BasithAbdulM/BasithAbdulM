import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.Set;

public class WWWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/Dreivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Link.html");

        WebElement home = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/a"));
        home.click();

        WebElement window = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[11]/a/h5"));
        window.click();
        //old window control
        String oldwindow = driver.getWindowHandle();

        //open homepage in new window
        WebElement homepage = driver.findElement(By.id("home"));
        homepage.click();

        //new window controls
        Set<String> newwindow = driver.getWindowHandles();

        for (String newwindows : newwindow
        ) {
            driver.switchTo().window(newwindows);

        }
        WebElement button = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[2]/a/h5"));
        button.click();
        driver.close();
        //return control to old window
        //close all except parent window
        driver.switchTo().window(oldwindow);

        //Find the number of opened windows
        WebElement multiplewindow= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
        multiplewindow.click();

        //Size of windows opened
        int numberofwindows=driver.getWindowHandles().size();
        System.out.println("No of Windows opened is :"+numberofwindows);

        // close all except parent window
        WebElement donotcloseme= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/button"));
        donotcloseme.click();

        Set<String> closechildwindows= driver.getWindowHandles();

        for (String ccw:closechildwindows
             ) {
            if (!ccw.equals(oldwindow)){
                driver.switchTo().window(ccw);
                driver.close();
            }

        }

    }
    }

