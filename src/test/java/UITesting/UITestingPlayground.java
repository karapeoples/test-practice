package UITesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class UITestingPlayground {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        String homeURL = "http://uitestingplayground.com/";

        driver.get(homeURL);

        driver.findElement(By.linkText("Dynamic ID")).click();
        driver.get(homeURL);


        driver.findElement(By.linkText("Class Attribute")).click();
        driver.get(homeURL);


        driver.findElement(By.linkText("Hidden Layers")).click();
        driver.get(homeURL);


        driver.findElement(By.linkText("Load Delay")).click();
        driver.get(homeURL);


        driver.findElement(By.linkText("AJAX Data")).click();
        driver.get(homeURL);


        driver.findElement(By.linkText("Client Side Delay")).click();
        driver.get(homeURL);


        driver.findElement(By.linkText("Click")).click();
        driver.get(homeURL);


        driver.findElement(By.linkText("Text Input")).click();
        driver.get(homeURL);


        driver.findElement(By.linkText("Scrollbars")).click();
        driver.get(homeURL);


        driver.findElement(By.linkText("Dynamic Table")).click();
        driver.get(homeURL);


        driver.findElement(By.linkText("Verify Text")).click();
        driver.get(homeURL);


        driver.findElement(By.linkText("Progress Bar")).click();
        driver.get(homeURL);


        driver.findElement(By.linkText("Visibility")).click();
        driver.get(homeURL);


        driver.findElement(By.linkText("Sample App")).click();
        driver.get(homeURL);


        driver.findElement(By.linkText("Mouse Over")).click();
        driver.get(homeURL);


        driver.findElement(By.linkText("Non-Breaking Space")).click();
        driver.get(homeURL);


        driver.findElement(By.linkText("Overlapped Element")).click();
        driver.get(homeURL);


       driver.quit();
    }
}
