package com.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserlaunch {

	public static void main(String[] args) {
	
		
		 WebDriverManager.iedriver().setup();
		 
		 WebDriver driver = new InternetExplorerDriver();
		 
		 driver.get("https://www.facebook.com/index.php/");
		
		
		
		
		
		

	}

}
