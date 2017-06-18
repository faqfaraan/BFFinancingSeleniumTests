package ContactUs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Faraan on 6/18/2017.
 */
public class TestBase {

    public WebDriver driver = null;

    public void openBFFinancing() throws IOException{

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\dev\\workspace\\Eclipse EE Workspace\\BFFinancing Testing\\src\\ContactUs\\variables.properties");
        prop.load(fis);

        if(prop.getProperty("browser").equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\dev\\tools\\Selenium\\chromedriver.exe");
            driver =new ChromeDriver();
        } else if (prop.getProperty("browser").equals("firefox")){
            System.out.println("need to set this up for firfox");
        }

        driver.get(prop.getProperty("url"));
    }
}
