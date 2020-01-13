package web;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Desktop//Selenium//chromedriver_win32//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("https://demo.opencart.com/");
		String var1 = objDriver.getTitle();
		String var2= "Your Store";
		if(var1.equalsIgnoreCase(var2))
			System.out.println("home page found");
		else
			System.out.println("home page not found");
		WebElement obj1=objDriver.findElement(By.xpath("//html/body/div[1]/nav/div[2]/ul/li[2]/a"));
		obj1.click();
		WebElement obj2=objDriver.findElement(By.xpath("//html/body/div[1]/nav/div[2]/ul/li[2]/div/a"));
		obj2.click();
		System.out.println("laptops selected");
		
		WebElement obj3=objDriver.findElement(By.id("input-limit"));
		Select s1 = new Select(obj3);
		List<WebElement> list=s1.getOptions();
		for(WebElement e : list) {
			System.out.println(e.getText());
		}
		System.out.println("min value "+list.get(0).getText());
		System.out.println("max value "+list.get(list.size()-1).getText());
		
		
		objDriver.close();
		
	}

}
