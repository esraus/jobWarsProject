package JobWars;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LogIn {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.jobwars.de/");



        driver.findElement(By.xpath("//div/input[@placeholder='Email']")).sendKeys("yasarengin034@gmail.com");
        driver.findElement(By.xpath("//div/input[@placeholder='Password']")).sendKeys("E19821988y");
        driver.findElement(By.xpath("//span[@class='p-button-label p-c']")).click();
    }

}
