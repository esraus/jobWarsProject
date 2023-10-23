package JobWars;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class test {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.jobwars.de/");
        Thread.sleep(3000);
        WebElement login  = driver.findElement(By.xpath("//li[text()='Log In']"));
        login.click();
        Thread.sleep(3000);
        WebElement emailBox = driver.findElement(By.xpath("//div/input[@placeholder='Email']"));
        emailBox.sendKeys("euymazsaral@gmail.com");
        Thread.sleep(3000);
        WebElement passwordBox = driver.findElement(By.xpath("//div/input[@placeholder='Password']"));
        passwordBox.sendKeys("Jobwars.1");
        Thread.sleep(3000);
        WebElement loginButton = driver.findElement(By.xpath("//span[@class='p-button-label p-c']"));
        loginButton.click();
        Thread.sleep(3000);
        WebElement myProfileButton = driver.findElement(By.xpath("//div[@class='ml-auto flex items-center gap-5 md:hidden lg:hidden']/div/div"));
        myProfileButton.click();
        WebElement profile = driver.findElement(By.xpath("(//li[@class='flex gap-3 mt-5 items-center cursor-pointer'])[1]"));
        profile.click();

        WebElement addDocument = driver.findElement(By.xpath("//p[text()='Add Document']"));
        addDocument.click();
        String path = "C://Users//lenovo//Desktop//Jira_integation_with_selenium.pdf";

        WebElement uploadNow = driver.findElement(By.xpath("//input[@class='hidden']"));
        Thread.sleep(5000);

        uploadNow.sendKeys(path);

        WebElement saveButton = driver.findElement(By.xpath("//button[@class='p-button p-component w-[150px] h-[40px]']"));
        saveButton.click();


    }}
