package Generic_Utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WebDriver_Utility {

	public void maximizeWindow(WebDriver driver)

	{
		driver.manage().window().maximize();
	}
	public void implicitlyWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void windowSwitching(WebDriver driver , String partialTitle)
	{
		Set<String> allWins = driver.getWindowHandles();
		Iterator<String> iterator = allWins.iterator();
		while (iterator.hasNext()){
			String win = iterator.next();
			driver.switchTo().window(win);
			@Nullable
			String title = driver.getTitle();
			if(title.contains(partialTitle))
			{
				break;
			}
		}
	}
	
	public void alertAccept(WebDriver c)
	{
		c.switchTo().alert().accept();
	}
	
	
//	public void screenShot() {
//		TakesScreenshot ts = (TakesScreenshot) BaseClass.sdriver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File dst = new File("./ScreenShots/image.png");
//		try {
//			FileUtils.copyFile(src, dst);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

public static String takeScreenShot1(WebDriver driver, String screenShotName) throws Throwable {
		
		TakesScreenshot takesSceenShot = (TakesScreenshot) driver;
		File src = takesSceenShot.getScreenshotAs(OutputType.FILE);
		File dst = new File("./ScreenShots/" + screenShotName +".png");
		FileUtils.copyFile(src, dst);
		return dst.getAbsolutePath();
	}
} 