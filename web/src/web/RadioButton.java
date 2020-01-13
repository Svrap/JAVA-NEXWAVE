package web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Desktop//Selenium//chromedriver_win32//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("http://demo.automationtesting.in/Register.html");

		List<WebElement> obj1=objDriver.findElements(By.name("radiooptions"));
		obj1.get(0).click(); System.out.println("Male button is displayed "+
				obj1.get(0).isDisplayed()); System.out.println("feMale button is displayed "+
						obj1.get(1).isDisplayed());
				System.out.println("is the male radio button selected : " +
						obj1.get(0).isSelected());
				System.out.println("is the female radio button selected : " +
						obj1.get(1).isSelected()); 
				//check box starts
				List<WebElement> checks =objDriver.findElements(By.className("checks")); 
				System.out.println("Number of check boxes "+checks.size());
				//checks.get(0).click();
				WebElement obj2=objDriver.findElement(By.id("checkbox1"));
				WebElement obj3=objDriver.findElement(By.id("checkbox2"));
				WebElement obj4=objDriver.findElement(By.id("checkbox3"));
				obj2.click();
				System.out.println("is checkbox 1  clicked "+obj2.isSelected());
				System.out.println("is checkbox 2 clicked"+obj3.isSelected());
				System.out.println("is checkbox 3 clicked" + obj4.isSelected());
				//dropdown boxes starts
								//s1.click();
				Select s1 = new Select(objDriver.findElement(By.id("Skills")));
				s1.selectByVisibleText("Adobe InDesign");
				//objDriver.close();

	}


}
