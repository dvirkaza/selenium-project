import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aac.ac.il/");
        driver.findElement(By.className("info-btn")).findElement(By.tagName("a")).click();
        WebElement userName=driver.findElement(By.id("Ecom_User_ID"));
        if (userName!=null) {
            userName.sendKeys("dvirkazayof");
        }
        WebElement password=driver.findElement(By.id("Ecom_Password"));
        password.sendKeys("ofrit1204");
        driver.findElement(By.id("wp-submit")).click();
        driver.get(driver.getCurrentUrl());


    }
}