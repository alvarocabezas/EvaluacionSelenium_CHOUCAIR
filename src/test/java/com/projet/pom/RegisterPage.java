package com.projet.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends Base {
	
	// variables privadas del usuario a registrar
	private String UserEmail = "Pruebaaaicabezas12322@gmail.com";
	private String UsePasword = "Alvaro100@@";
	
	private String Birthday_date_Mes = "May";
	private String Birthday_date_Dia = "4";
	private String Birthday_date_Ano = "2000";
	
	
	//LOCALIZADORES DE LOS ELEMENTOS 
	//-----------------------------------------------------------------------------------------------------------------------
	//boton de ingreso al registro
	By ButtonIngresoRegister  = By.className("unauthenticated-nav-bar__sign-up");
	//localizador del ingresar el nombre
	By nombre  = By.id("firstName");
	//localizador del ingresar el apellido
	By apellido = By.id("lastName");
	//localizador del ingresar el email
	By email  = By.id("email");
	
	//ingreso de la fecha de nacimiento
	//MES
	By clickMes = By.id("birthMonth");	
	//DIA
	By clickDia = By.id("birthDay");
	//AÑO
	By clickAno = By.id("birthYear");

	
	//botonde paso a la  segunda seccion 
	By ButtonSegundaSeccionRegister = By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a");
	
	
	//-----------------------------------------------------------------------------------------------------------------------
	
	//botonde paso a la  tercera seccion 
	By ButtonTerceraSeccionRegister = By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a");
	
	//-----------------------------------------------------------------------------------------------------------------------	
	//selecionar modelo
	By DispositivoMovil = By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span");
	By SelectionMovil = By.xpath("//*[@id=\"ui-select-choices-row-6-37\"]/span");
	
	//selecionar modelo
	By ModeloMovil = By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span");
	By SelectionModeloMovil = By.xpath("//*[@id=\"ui-select-choices-row-7-425\"]/span");
	
	//selecionar modelo
	By SisOpeMovil = By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span");
	By SelectionSisOpeMovil = By.xpath("//*[@id=\"ui-select-choices-row-8-2\"]/span");
	
	//botonde paso a la  cuarta seccion 
	By ButtonCuartaSeccionRegister = By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a");
	
	//-----------------------------------------------------------------------------------------------------------------------			
	//Contraseña
	By pasword = By.id("password");
	By comfirPasword = By.id("confirmPassword");
	
	//Check de validacion de servicios
	By Check1 = By.name("newsletterOptIn");
	By Check2 = By.name("termOfUse");
	By Check3 = By.name("privacySetting");
	
	//boton de registro completado
	By buttonRegisterComple = By.id("laddaBtn");
	
	

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void regiterUser() throws InterruptedException {
		//Tiempo de espera 5 segundos
		Thread.sleep(5000);
		
		//Click boton de registro
		click(ButtonIngresoRegister);
		
		//Tiempo de espera de 1 segundos
		Thread.sleep(1000);
		
		//Ingreso nombre
		type("alvaro", nombre);
		
		//Tiempo de espera de 1 segundos
		Thread.sleep(1000);
		//Ingreso apellido
		type("cabezas", apellido);
		
		//Tiempo de espera de 1 segundos
		Thread.sleep(1000);
		//Ingreso email
		type(UserEmail, email);
		
		//Tiempo de espera de 1 segundos
		Thread.sleep(1000);
		
		//Seleccionar mes de nacimiento
		Select selectListMes = new Select(findElement(clickMes));
		selectListMes.selectByVisibleText(Birthday_date_Mes);
		getText(selectListMes.getFirstSelectedOption());

		//Tiempo de espera de 1 segundos
		Thread.sleep(1000);
		
		//Seleccionar dia de nacimiento
		Select selectListDia = new Select(findElement(clickDia));
		selectListDia.selectByVisibleText(Birthday_date_Dia);
		getText(selectListDia.getFirstSelectedOption());
		
		//Tiempo de espera de 1 segundos
		Thread.sleep(1000);
		
		//Seleccionar año de nacimiento
		Select selectListAno = new Select(findElement(clickAno));
		selectListAno.selectByVisibleText(Birthday_date_Ano);
		getText(selectListAno.getFirstSelectedOption());
		
		//Tiempo de espera de 1 segundos
		Thread.sleep(1000);
		
		//Boton de ingeso a la segunda seccion del registro
		click(ButtonSegundaSeccionRegister);
		
		//Tiempo de espera de 1 segundos
		Thread.sleep(1000);
//------------------------------------------------------------------------------		
		
		//Boton de ingeso a la Tercera seccion del registro
		click(ButtonTerceraSeccionRegister);
		
		//Tiempo de espera de 4 segundos
		Thread.sleep(4000);
		
//------------------------------------------------------------------------------	
		
		//abre la pestaña de la seleccion del movil
		click(DispositivoMovil);
		
		//sleciona el movil
		click(SelectionMovil);
		
		//Tiempo de espera de 4 segundos
		Thread.sleep(4000);
		
		//abre la pestaña de la seleccion del modelo del movil
		click(ModeloMovil);
		
		//sleciona el modelo
		click(SelectionModeloMovil);
		
		//Tiempo de espera de 4 segundos
		Thread.sleep(4000);
		
		//abre la pestaña de la seleccion del sistema operativo del movil
		click(SisOpeMovil);
		
		//sleciona el sistema operativo
		click(SelectionSisOpeMovil);
		
		//Tiempo de espera de 3 segundos
		Thread.sleep(3000);

		click(ButtonCuartaSeccionRegister);
		
		//Tiempo de espera de 1 segundos
		Thread.sleep(1000);
//------------------------------------------------------------------------------
	
		//Ingreso de contraseña
		type(UsePasword, pasword);
		
		//Tiempo de espera de 1 segundos
		Thread.sleep(1000);
		
		//Ingreso la confirmacion de la contraseña
		type(UsePasword, comfirPasword);
		
		//Tiempo de espera de 1 segundos
		Thread.sleep(1000);
		
		//seleciona check de mantenerme informado
		click(Check1);
		
		//Tiempo de espera de 1 segundos
		Thread.sleep(1000);
		
		//seleciona check de terminos de uso
		click(Check2);
		
		//Tiempo de espera de 1 segundos
		Thread.sleep(1000);
		
		//seleciona check de politica de seguridad
		click(Check3);
		
		//Tiempo de espera de 1 segundos
		Thread.sleep(1000);
		
		//boton de guardar el usuario
		click(buttonRegisterComple);
		
		//Tiempo de espera de 10 segundos
		Thread.sleep(10000);
		
				
	}

	

	
	
	
	
	
	
	
	
	
}
