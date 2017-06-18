package ContactUs;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Faraan on 6/18/2017.
 */
public class HappyPath extends TestBase{

    @Test
    public void OpeningContactUs() throws IOException{
        System.out.println("Open Contact Us Page");
        openBFFinancing();
    }

    @Test
    public void FillContactUsForm() throws IOException{
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\dev\\workspace\\Eclipse EE Workspace\\BFFinancing Testing\\src\\ContactUs\\variables.properties");
        prop.load(fis);

        openBFFinancing();
        driver.findElement(By.name("first")).sendKeys(prop.getProperty("firstname"));
        driver.findElement(By.name("last")).sendKeys(prop.getProperty("lastname"));
        driver.findElement(By.name("address1")).sendKeys(prop.getProperty("address1"));
        driver.findElement(By.name("address2")).sendKeys(prop.getProperty("address2"));
        driver.findElement(By.name("city")).sendKeys(prop.getProperty("city"));
        driver.findElement(By.name("state")).sendKeys(prop.getProperty("state"));
        driver.findElement(By.name("zipcode")).sendKeys(prop.getProperty("zipcode"));
        driver.findElement(By.name("phone")).sendKeys(prop.getProperty("phone"));
        driver.findElement(By.name("email")).sendKeys(prop.getProperty("email"));
        driver.findElement(By.name("company")).sendKeys(prop.getProperty("company"));
        driver.findElement(By.name("message")).sendKeys(prop.getProperty("message"));

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/div/div/p")).getText(), "Your mail has been sent successfully!");


    }
}
