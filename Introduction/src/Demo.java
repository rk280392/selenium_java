import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-extensions");
		options.addArguments("--no-sandbox");
		System.setProperty("webdriver.chrome.driver", "/home/rajesh-pc/study/eclipse/chromedriver");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://learningdevops.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("/html/body/header/div/div/nav/ul/li[2]/a"));
		// driver.close(); //closes current browser
		// driver.quit(); //closes all browsers opened by selenium
	}

}