package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.masterthought.cucumber.json.Output;

public class BasePage {
	public static WebDriver driver;
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	public int randomgenetor(int max,int min) {
		Random random = new Random();
		int num=random.nextInt(max-min+1)+min;
		return num;
		
	}
	public  void takeSreenshot(WebDriver driver) {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
		
		SimpleDateFormat formatter=new SimpleDateFormat("MMddyy_HHmmss");
		Date date=new Date();
		String label=formatter.format(date);
		try {
			FileUtils.copyFile(sourcefile, new File(System.getProperty("use.dir")+"/sreenshot/"+label+".png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
