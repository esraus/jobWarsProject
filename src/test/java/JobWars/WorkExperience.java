package JobWars;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class WorkExperience {


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
        WebElement addWorkExperience = driver.findElement(By.xpath("//p[text()='Add Work Experience']"));
        addWorkExperience.click();
        WebElement jobTitleBox = driver.findElement(By.xpath("(//div[@class='p-dropdown p-component p-inputwrapper'])[1]"));
        jobTitleBox.click();
        Thread.sleep(1000);
        WebElement jobTitleSelect = driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li[text()='Data Analytics Specialist']"));
        jobTitleSelect.click();
        WebElement employmentType= driver.findElement(By.xpath("//div[@class='p-dropdown p-component p-inputwrapper']"));
        employmentType.click();
        /*WebElement fullTime = driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li[text()='Full Time']"));
        fullTime.click(); */
        List<WebElement> EmploymentType = driver.findElements(By.xpath("//ul//li[@role='option']"));

       EmploymentType.get(4).click();
        EmploymentType.
        Thread.sleep(4000);


        // for (WebElement each: EmploymentType
             // ) {
           // System.out.println(each.getText());
        WebElement from = driver.findElement(By.xpath("//input[@class='p-inputtext p-component']"));
        from.sendKeys("05/11/2022");
        Thread.sleep(3000);
        WebElement until = driver.findElement(By.xpath("//div[@class='p-checkbox-box']"));
        until.click();
        Thread.sleep(3000);
        WebElement company = driver.findElement(By.xpath("(//div[@class='flex flex-col gap-1 h-28 w-full lg:h-auto']/input[@class='p-inputtext p-component'])[1]")) ;
        company.sendKeys("jobwars");
        Thread.sleep(3000);
        WebElement webSite = driver.findElement(By.xpath("//div[@class='flex flex-col gap-1 h-28 w-full lg:h-auto']/input[@class='p-inputtext p-component']")) ;
        webSite.sendKeys("www.google.com");
        WebElement location = driver.findElement(By.xpath("//div[@class='flex flex-col gap-1 h-28']/input[@class='p-inputtext p-component']"));
        location.sendKeys("İzmir");
        WebElement description = driver.findElement(By.xpath("//textarea[@data-pc-name='inputtextarea']"));
        description.sendKeys("description of work experiences");
        WebElement saveButton = driver.findElement(By.xpath("//*[text()='Save']"));
        saveButton.click();

    }





}
