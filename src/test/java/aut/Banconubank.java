package aut;

import static org.junit.Assert.*;

import java.util.jar.Attributes.Name;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Banconubank {
   String texto;
   WebDriver driver;
   
   
	@Before
	public void setUp() throws Exception {
    
    //comando para inserir rota de navegaçao do driver
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	
	//comando para chamar o driver dentro da class
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.4devs.com.br/gerador_de_pessoas");
	driver.manage().window().maximize();
	JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
	
	//descer a tela até o elemento
	jsExecutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.cssSelector("#bt_gerar_pessoa")));
	driver.findElement(By.cssSelector("#cookiescript_accept")).click();
	driver.findElement(By.cssSelector("#bt_gerar_pessoa")).click();
	Thread.sleep(30000);
	String cpf;
	cpf = driver.findElement(By.id("cpf")).getText();
	System.out.println(cpf);
	String nome;
	nome = driver.findElement(By.id("nome")).getText();
	System.out.println(nome);
	String celular;
	celular = driver.findElement(By.id("celular")).getText();
	System.out.println(celular);
	String email;
	email = driver.findElement(By.id("email")).getText();
	System.out.println(email);
	WebElement confirmaremail;
	confirmaremail = driver.findElement(By.id("email"));
	System.out.println(confirmaremail);
	//comandos para acessar e preencher campos
	driver.get("https://nubank.com.br/pedir/nu/?utm_source=google&utm_medium=cpc&utm_campaign=19633581018&utm_term=&utm_word=&utm_content=&ad_position=&match_type=&locatio");
	driver.manage().window().maximize();
	driver.findElement(By.name("cpf")).sendKeys(cpf);
	driver.findElement(By.cssSelector("#short-form > div.sc-ksNGjt.gDytHF > button")).click();
    driver.findElement(By.name("name")).sendKeys(nome);
	driver.findElement(By.name("phone")).sendKeys(celular);
    driver.findElement(By.name("email")).sendKeys(email);
    driver.findElement(By.name("emailConfirmation")).sendKeys(email);
    
    //comando de tempo
    Thread.sleep(30000);
    
    //confirmar check box
    driver.findElement(By.cssSelector("#label-acceptedWhatsapp")).click();
    driver.findElement(By.cssSelector("#label-accepted")).click();
    
    //confirmar
   driver.findElement(By.cssSelector("#complete-form-drawer > div > div > div.sc-kxtUkE.jKEmYc > form > div > div.sc-dsKijY.dTZaxR > div > button")).click();
    
    
   // texto para confirmar a abertura da conta
   
   
   Thread.sleep(5000);
     texto = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/div/h4")).getText();
     System.out.println(texto);
    
	}

	@After
	public void tearDown() throws Exception {  
 
	
	
	}

	@Test
	public void test() {
		
    
	
	
	}

}