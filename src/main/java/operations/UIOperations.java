package operations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UIOperations extends ReadClassPageObjects{
	
	public static WebDriver driver;
	
	public void driverInitilization()
	//public static void main(String args[])
	{
		if(prop.getProperty("Browser").equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(prop.getProperty("URL"));
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		else if(prop.getProperty("Browser").equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\java\\resources\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get(prop.getProperty("URL"));
			driver.manage().window().maximize();
		}
		else if(prop.getProperty("Browser").equals("InternetExplorer"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\main\\java\\resources\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.get(prop.getProperty("URL"));
			driver.manage().window().maximize();
		}	
	}

	public void click(WebElement locator)
	{
		locator.click();
	}
	
	public void entertext(WebElement locator, String text)
	{
		locator.sendKeys(text);
	}
	
	public void waitForElementToLoad(int time)

	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public boolean getText(WebElement locator)
	{
		locator.getText();
		return false;
	}
	
	public void closeAllOpenBrowser()
	{
		driver.quit();
	}
	
	public void closeCurrentBroswer()
	{
		driver.close();
	}

}
