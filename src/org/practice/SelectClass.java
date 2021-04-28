package org.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Practice\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);


		WebElement btnClick = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		btnClick.click();

		WebElement btn = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		btn.click();

		Alert al=driver.switchTo().alert();
		al.dismiss();

	}
}
