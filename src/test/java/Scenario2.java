import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Scenario2 {

    static final String firstName = "Test";
    static final String lastName = "User";

    public static void main(String[] args) throws InterruptedException {
        int pageLoadTimeout = 30;
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.phptravels.net");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("(//*[@id='li_myaccount'])[2]")).click();


        WebElement loginElement = driver.findElement(By.xpath("(//*[text()=' Login' and @class='go-text-right'])[2]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(loginElement).click().perform();

        driver.findElement(By.xpath("//input[@type='email' and @name='username']")).sendKeys("testuser@gmail.com");

        driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("Password@123");

        new WebDriverWait(driver, pageLoadTimeout).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        By ele = By.xpath("//button[@type='submit' and text()='Login']");
        WebElement loginButton = driver.findElement(ele);

        new WebDriverWait(driver, pageLoadTimeout).until(ExpectedConditions.visibilityOfElementLocated(ele));
        loginButton.click();

        String UserName = driver.findElement(By.xpath("//h3[@class='RTL']")).getText();

        if(UserName.contains(firstName) && UserName.contains(lastName)){
            System.out.println("Successfully logged in as " + UserName.replace("Hi,", ""));
        }

    }
}





