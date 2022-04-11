package project_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        String baseURl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseURl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        System.out.println("PAGE TITLE : " + driver.getTitle());
        System.out.println("CURRENT URL : " + driver.getCurrentUrl());
        System.out.println("PAGE SOURCE : " + driver.getPageSource());

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("Prime Test");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Prime");

        driver.close();



    }

}
