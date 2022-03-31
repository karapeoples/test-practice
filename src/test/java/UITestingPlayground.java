import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class UITestingPlayground {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.edgedriver().setup();
        WebDriverManager.firefoxdriver().setup();

        WebDriver cDriver = new ChromeDriver();
        WebDriver ffDriver = new FirefoxDriver();
        WebDriver eDriver = new EdgeDriver();


        cDriver.get("http://uitestingplayground.com/");
        ffDriver.get("http://uitestingplayground.com/");
        eDriver.get("http://uitestingplayground.com/");

    }
}
