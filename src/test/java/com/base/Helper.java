package com.base;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Helper {
	public static WebDriver driver;
	static Actions a;
	static Alert al;
	static Workbook w;
	public static void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prakash\\eclipse-workspace\\Windows\\dri\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	public static void windowsManage() {
		driver.manage().window().maximize();
	}	
	public static void loadUrl(String url) {
	driver.get(url);
}
	public static String getTitle() {
	String title = driver.getTitle();
	return title;
}
	public static String getCurrentUrl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;
}
	public static void getText(WebElement e ) {
	String text = e.getText();
	System.out.println(text);
}
	public static void btnClick(WebElement e ) {
	e.click();
}
	public static void sendKeyBase(WebElement e, String value ) {
		e.sendKeys(value);
}
	public static String getAtrribute(WebElement e) {
		String text=e.getAttribute("value");
		return text;
}
	public static void moveToElement(WebElement e) {
		 a =new Actions(driver);
		a.moveToElement(e).perform();
	}
	//public static void dragAndDrop(WebElement e) {
	    // a.dragAndDrop(e, null).perform();
//}
	public static void doubleClick(WebElement e) {
		a.doubleClick(e).perform();
	}
	public static void rightClick(WebElement e) {
		a.contextClick(e).perform();
}
	public static void alertAccept() {
		  driver.switchTo().alert();
				al.accept();
}
	public static void alertDismiss() {
		  driver.switchTo().alert();
				al.dismiss();
}
	public static void takesScreenShot(String value) throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
			File source = tk.getScreenshotAs(OutputType.FILE);
			System.out.println(source);
			File desn = new File (value);
			FileUtils.copyFile(source, desn);	
	}
	public static void selectVisibleText(WebElement e , String value) {
		Select s = new Select(e);
		s.selectByVisibleText(value);
	}
			}
			

		
		
			
		
		
		
		
		
		
		

	

