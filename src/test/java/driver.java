import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.util.Random;

import static java.util.concurrent.TimeUnit.SECONDS;

public class driver {


    //TODO  implement TestNG or JUNit unit testing framework
    //TODO remove hardcoded values from the test file. Instead create a separate Object locatior file , Config file
    //TODO Implement Page Object model for better handling of test code

        public static void main(String[] args) throws InterruptedException {
            //TODO remove hardcoded chromedriver path . try to add dynamic path detection .

            System.setProperty("webdriver.chrome.driver","/Users/nelsonanburaj/Downloads/chromedriver_2");
            WebDriver dr = new ChromeDriver();
            //TODO Implement the other browser logic .
            //
            dr.get("https://www.phptravels.net/");
            dr.manage().window().maximize();


            //TODO Create generic method to handle Wait mechanism
            Wait<WebDriver> wait = new FluentWait<WebDriver>(dr)

                    .withTimeout(120, SECONDS)

                    .pollingEvery(5, SECONDS)

                    .ignoring(NoSuchElementException.class);
            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(1000);
            WebElement account;
            account = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("(//*[@id='li_myaccount'])[2]"))));
            account.click();

            WebElement signup;
            signup=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("(//*[text()='  Sign Up'])[2]"))));
            signup.click();

            WebElement firstname;
            firstname=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("(//*[@class='form-control'])[1]"))));
            firstname.sendKeys("nelson");

            WebElement midname;
            midname=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("(//*[@class='form-control'])[2]"))));
            midname.sendKeys("anbu");

            WebElement phonenumber;
            phonenumber=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("(//*[@class='form-control'])[3]"))));
            phonenumber.sendKeys("9874562153");


            //TODO  Get values from the external data source. avoid hard coding
            WebElement email;
            email=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("(//*[@class='form-control'])[4]"))));
            email.sendKeys("emailid"+randomInt+"@gmail.com");

            WebElement password;
            password=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("(//*[@class='form-control'])[5]"))));
            password.sendKeys("nelsonraj@1");

            WebElement cofirmPassword;
            cofirmPassword=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("(//*[@class='form-control'])[6]"))));
            cofirmPassword.sendKeys("nelsonraj@1");


            WebElement signUp;
            signUp=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("//*[@class='signupbtn btn_full btn btn-action btn-block btn-lg']"))));
            signUp.click();

            WebElement booking;
            booking=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("//*[@class='bookings-icon']"))));
            booking.click();

            WebElement profile;
            profile=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("//*[@class='profile-icon']"))));
            profile.click();

            WebElement wishlist;
            wishlist=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("//*[@class='wishlist-icon']"))));
            wishlist.click();



            WebElement newLetter;
            newLetter=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("//*[@class='newsletter-icon']"))));
            newLetter.click();


            WebElement hotel;
            hotel=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("//*[text()='Hotels    ']"))));
            hotel.click();

            WebElement hoteClick;
            hoteClick=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("//*[text()='Search by Hotel or City Name']"))));
            hoteClick.click();

            WebElement hotelSearach;
             hotelSearach=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("(//*[@class='select2-input'])[6]"))));
            hotelSearach.sendKeys("Kupiano");


            WebElement hotelSearachClick;
            hotelSearachClick=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("//*[text()='Kupiano']"))));
            hotelSearachClick.click();


            WebElement startDate;
            startDate=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("(//*[@placeholder='Check in'])[1]"))));
            startDate.sendKeys("17/06/2019");

          /*  WebElement dateClick;
            dateClick=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("(//*[@class='day  active'])[1]"))));
            dateClick.click();*/

            WebElement endDate;
            endDate=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("//*[@placeholder='Check out']"))));
            endDate.sendKeys("19/06/2019");
/*
            WebElement endDateClick;
            endDateClick=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("(//*[text()='15'])[5]"))));
            endDateClick.click();*/
            WebElement search;
            search=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("//*[text()=' Search']"))));
            search.click();


            WebElement star;
            star=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("(//*[@class='go-left'])[5]"))));
            star.click();


            WebElement types;
            types=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("(//*[@class='iCheck-helper'])[9]"))));
            types.click();


          /*  WebElement amenities;
            amenities=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("//*[text()='  Elevator']"))));
            amenities.click();
*/

            WebElement details;
            details=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("(//button[text()='Details'])[5]"))));

            JavascriptExecutor jse2 = (JavascriptExecutor)dr;
            jse2.executeScript("arguments[0].scrollIntoView()", details);
            details.click();

            WebElement sortClick;
            sortClick=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("(//*[@class='control__indicator'])[1]"))));
            JavascriptExecutor jse3 = (JavascriptExecutor)dr;
            jse3.executeScript("arguments[0].scrollIntoView()",sortClick);
            sortClick.click();

            WebElement payNow;
            payNow=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("//*[@class='book_button btn btn-md btn-success btn-block btn-block chk mob-fs10 loader']"))));
            payNow.click();

            WebElement noClick;
            noClick=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("(//*[text()='No'])[1]"))));
            JavascriptExecutor jse4 = (JavascriptExecutor)dr;
            jse4.executeScript("arguments[0].scrollIntoView()",noClick);
            noClick.click();

            WebElement additionalRequest;
            additionalRequest=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("(//*[@class='form-control'])[4]"))));
            JavascriptExecutor jse5 = (JavascriptExecutor)dr;
            jse5.executeScript("arguments[0].scrollIntoView()",sortClick);
            additionalRequest.sendKeys("balaji moves automation to development");


            WebElement apply;
            apply=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("//*[text()='CONFIRM THIS BOOKING']"))));
            JavascriptExecutor jse6= (JavascriptExecutor)dr;
            jse6.executeScript("arguments[0].scrollIntoView()",apply);
            apply.click();

            System.out.println("TESTCASES PASSED");



        }
    }