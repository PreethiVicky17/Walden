package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TEstng {
	WebDriver driver;
	
	public void test1() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("welcome");
		driver.get("www.google.com");
	}

}