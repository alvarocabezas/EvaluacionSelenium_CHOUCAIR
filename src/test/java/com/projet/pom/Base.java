package com.projet.pom;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	private WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver chromeDriverConection() {
		//direccion del chromeDriver
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/DriverChrome/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	//------------------------------------------------
	public List<WebElement> findElements(By locator){
		return driver.findElements(locator);
	}
	//------------------------------------------------
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	//determina la selecion en funcion del texto selecionado
	public void getText(By locator) {
		driver.findElement(locator).getText();
	}
	
	//dijita texto en lo selecionado
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	//click lo selecionado
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	//dirigue al chromeDriver a la url dijitada
	public void visit(String url) {
		driver.get(url); 
	}
	
}
