package web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropOne {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Desktop//Selenium//chromedriver_win32//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("http://demo.automationtesting.in/Register.html");
		Select s1 = new Select(objDriver.findElement(By.id("Skills")));
		s1.selectByVisibleText("Adobe InDesign");
		Select con = new Select(objDriver.findElement(By.id("countries")));
		con.selectByValue("India");
		Select s2 = new Select(objDriver.findElement(By.id("yearbox")));
		s2.selectByValue("1999");
		Select s3 = new Select(objDriver.findElement(By.xpath("//html/body/section/div/div/div[2]/form/div[11]/div[2]/select")));
		s3.selectByValue("February");
		Select s4 = new Select(objDriver.findElement(By.id("daybox")));
		s4.selectByValue("10");
		//objDriver.close();
	}

}
