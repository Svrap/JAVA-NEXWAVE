package web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextOne {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Desktop//Selenium//chromedriver_win32//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("http://demo.automationtesting.in/Register.html");
		List<WebElement> totalboxes = objDriver.findElements(By.xpath("//input[@type='text']"));
		System.out.println(totalboxes.size());
		for(WebElement ele:totalboxes)
			System.out.println(ele.getAttribute("placeholder"));
		//for image location
		
		WebElement w1 = objDriver.findElement(By.xpath("//html/body/header/div/div/div/div[1]/a/img"));
		System.out.println(w1.getLocation());
		System.out.println("img found");
		
		//Webdriver Wait
		WebDriverWait wait = new WebDriverWait(objDriver,20);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='header']")));
		boolean status = element.isDisplayed();
		if(status)
			System.out.println("============Webdriver visible===========");
		else
			System.out.println("===========Webdriver not visible=========");
		objDriver.close();
	
	}

}
