package com.del.validateCurrency;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class currency {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Desktop//Selenium//chromedriver_win32//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("https://demo.opencart.com/");
		System.out.println("Open opencart page loaded");
		String var1 = objDriver.getTitle();
		System.out.println("Title of the page"+var1);
		WebElement obj1 = objDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]"));
		obj1.click();
		System.out.println("added to cart");
		WebElement obj2 = objDriver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[4]/a[1]"));
		obj2.click();
		WebElement obj3 = objDriver.findElement(By.xpath("//html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]"));
		System.out.println(obj3.getText());
		String temp = obj3.getText();
		temp = temp.substring(1);
		Double amount = Double.parseDouble(temp);
		System.out.println("Amount in INR");
		System.out.println(amount*71.01+" INR");
		WebElement obj4 = objDriver.findElement(By.xpath("//html[1]/body[1]/nav[1]/div[1]/div[1]/form[1]/div[1]/button[1]"));
		obj4.click();
		WebElement obj5 = objDriver.findElement(By.xpath("//html[1]/body[1]/nav[1]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[1]/button[1]"));
		obj5.click();
		WebElement obj6 = objDriver.findElement(By.xpath("//html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]"));
		System.out.println("Amount in euros: "+obj6.getText());
		WebElement obj7 = objDriver.findElement(By.xpath("//html[1]/body[1]/nav[1]/div[1]/div[1]/form[1]/div[1]/button[1]"));
		obj7.click();
		WebElement obj8 = objDriver.findElement(By.xpath("//html[1]/body[1]/nav[1]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[2]/button[1]"));
		obj8.click();
		WebElement obj9 = objDriver.findElement(By.xpath("//html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]"));
		System.out.println("Amount in pounds: "+obj9.getText());
	
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		objDriver.quit();


	}

}
