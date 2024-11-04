package comherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        //set up Firefox browser
        WebDriver driver = new FirefoxDriver();

        //open url
        driver.get(baseUrl);

        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //print the title page
        String title = driver.getTitle();
        System.out.println(title);

        //Print the current Url
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current url : "+ currentUrl);

        //print the page source
        System.out.println("The page source : " + driver.getPageSource());

        //enter the email in email filed
        WebElement emailFiled = driver.findElement(By.id("username"));
        emailFiled.sendKeys("raj.123@gmail.com");

        // enter the password in password filed
        WebElement passwordFiled = driver.findElement(By.id("password"));
        passwordFiled.sendKeys("1234");

        //enter the login button
        WebElement loginLink = driver.findElement(By.cssSelector("button[type='submit']"));
        loginLink.click();

        //Print the current URL
        System.out.println("Get Current Url : " + driver.getCurrentUrl());

        //Refresh the page
        driver.navigate().refresh();

        //close the browser
        driver.quit();
    }
}


