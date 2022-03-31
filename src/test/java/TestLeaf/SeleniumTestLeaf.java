package TestLeaf;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTestLeaf {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();


        String homeURL = "http://www.leafground.com/home.html";

        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']")).click();
        driver.get(homeURL);


        driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@alt='Link']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@alt='Images']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@alt='ListBox']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@alt='Radio Button']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@alt='Checkbox']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@alt='Table']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@alt='Alert']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@alt='Frame']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@alt='Windows']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@alt='Calendar']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@alt='Draggable']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@alt='drop']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@alt='selectable']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@alt='sortable']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@alt='Auto Complete']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@alt='Download']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@alt='contextClick']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@src='images/tip.png']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@alt='disapper']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@alt='appear']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@src='images/change.png']")).click();
        driver.get(homeURL);

        driver.findElement(By.xpath("//img[@src='images/alertappear.png']")).click();
        driver.get(homeURL);


        driver.quit();
    }
}
