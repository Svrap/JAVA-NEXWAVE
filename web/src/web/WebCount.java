package web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCount {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Desktop//Selenium//chromedriver_win32//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("https://demo.opencart.com/");
		WebElement obj1=objDriver.findElement(By.xpath("//html/body/div[1]/nav/div[2]/ul/li[2]/a"));
		obj1.click();
		WebElement obj2=objDriver.findElement(By.xpath("//html/body/div[1]/nav/div[2]/ul/li[2]/div/a"));
		obj2.click();
		System.out.println("laptops selected");
		List<WebElement> links= objDriver.findElements(By.tagName("a"));
		System.out.println("Number of links for laptop "+ links.size());
		for(WebElement e : links)
			System.out.println(e.getAttribute("href"));
		
		WebElement obj3=objDriver.findElement(By.xpath("//html/body/div[1]/nav/div[2]/ul/li[4]/a"));
		obj3.click();
		
		System.out.println("tablets Selected");
		List<WebElement> tabs= objDriver.findElements(By.tagName("a"));
		System.out.println("Number of links for tablets "+ tabs.size());
		
		for(WebElement e : tabs)
			System.out.println(e.getAttribute("href"));
		objDriver.close();
		
	}
}
