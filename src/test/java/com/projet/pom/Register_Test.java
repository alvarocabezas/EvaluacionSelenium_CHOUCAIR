package com.projet.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Register_Test {
	
	private WebDriver driver;
	
	RegisterPage registerPage;	

	@Before
	public void setUp() throws Exception {
		//Ingreso del url 
		registerPage = new RegisterPage(driver);
		driver = registerPage.chromeDriverConection();
		registerPage.visit("https://utest.com");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		// cerrar chrome
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		//funcion de registro del usuario
		registerPage.regiterUser();
	}

}
