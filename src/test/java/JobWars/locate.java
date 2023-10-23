package JobWars;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class locate {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.jobwars.de/");
        Thread.sleep(9000);
        WebElement login  = driver.findElement(By.xpath("//li[text()='Log In']"));
        login.click();
        Thread.sleep(5000);
        WebElement emailBox = driver.findElement(By.xpath("//div/input[@placeholder='Email']"));
        emailBox.sendKeys("yasarengin034@gmail.com");
        Thread.sleep(5000);
        WebElement passwordBox = driver.findElement(By.xpath("//div/input[@placeholder='Password']"));
        passwordBox.sendKeys("E19821988y");
        Thread.sleep(5000);
        WebElement loginButton = driver.findElement(By.xpath("//span[@class='p-button-label p-c']"));
        loginButton.click();
        Thread.sleep(5000);
        WebElement myProfileButton = driver.findElement(By.xpath("//img[@alt='User Profile']"));
        myProfileButton.click();
        WebElement profile = driver.findElement(By.xpath("(//li[@class='flex gap-3 mt-5 items-center cursor-pointer'])[1]"));
        profile.click();
        WebElement addWorkExperience = driver.findElement(By.xpath("//p[text()='Add Work Experience']"));
        WebElement addReference = driver.findElement(By.xpath("//p[text()='Add Reference']"));
        WebElement addWorkEducation = driver.findElement(By.xpath("//p[text()='Add Work Education']"));
        WebElement addLanguage = driver.findElement(By.xpath("//p[text()='Add Languages']"));
        WebElement addSkill = driver.findElement(By.xpath("//p[text()='Add Skill']"));
        WebElement addDocument = driver.findElement(By.xpath("//p[text()='Add Document']"));
        WebElement emailText = driver.findElement(By.xpath("//p[@class='pl-2  text-[#484848] text-lg not-italic font-medium leading-[normal]']"));
        WebElement phoneNumber = driver.findElement(By.xpath("//p[@class='pl-2 text-[#F23B6C] text-lg not-italic font-medium leading-[normal]']"));
       // WebElement location = driver.findElement(By.xpath(""));


    }

}
