package web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class oneWeb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String uname = sc.next();
		String password = sc.next();
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Desktop//Selenium//chromedriver_win32//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("https://demo.opencart.com/");
		System.out.println("Open opencart page loaded");
		String var1 = objDriver.getTitle();
		System.out.println("Title of the page"+var1);
		WebElement obj1=objDriver.findElement(By.xpath("//html/body/footer/div/div/div[4]/ul/li[1]/a"));
		obj1.click();
		/*
		 * WebElement obj2=objDriver.findElement(By.xpath(
		 * "//html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input"));
		 * obj2.click(); String var2 = objDriver.getTitle();
		 * System.out.println("Title of the page "+ var2);
		 */
		WebElement obj3=objDriver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		obj3.sendKeys(uname);
		WebElement obj4=objDriver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		obj4.sendKeys(password);
		WebElement obj5=objDriver.findElement(By.xpath("//html/body/div[2]/div/div/div/div[2]/div/form/input"));
		obj5.click();
		/*
		 * String var3 = "Title of the page Account Login"; if(var2==var3)
		 * System.out.println("object exists"); else
		 * System.out.println("object not found");
		 */
		//objDriver.quit();



	}

}
