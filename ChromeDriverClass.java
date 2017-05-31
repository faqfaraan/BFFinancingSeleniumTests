import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverClass {
public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\dev\\tools\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://bffinancing.com/manage/contact");
		driver.findElement(By.name("first")).sendKeys("Faraan");
		driver.findElement(By.name("last")).sendKeys("Qureshi");
		driver.findElement(By.name("address1")).sendKeys("4641 Tuttles View Dr");
		driver.findElement(By.name("address2")).sendKeys("");
		driver.findElement(By.name("city")).sendKeys("Dublin");
		driver.findElement(By.name("state")).sendKeys("Ohio");
		driver.findElement(By.name("zipcode")).sendKeys("43016");
		driver.findElement(By.name("phone")).sendKeys("9377086337");
		driver.findElement(By.name("email")).sendKeys("faqfaraan@gmail.com");
		driver.findElement(By.name("company")).sendKeys("My Company");
		driver.findElement(By.name("message")).sendKeys("This is a test");

//		driver.findElement(By.xpath("/html/body/div/div/section[2]/div[2]/div/form/div/div[2]/button")).click();

		


}
}
