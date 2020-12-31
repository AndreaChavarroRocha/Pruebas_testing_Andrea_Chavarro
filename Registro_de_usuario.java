package Prueba_Choucair;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.util.concurrent.TimeUnit;

/*
Registro de usuario nuevo desde Sign In
1 hacer click en botón sign in
2 hacer scroll vertical hacia abajo
3 ingresar una palabra en el campo de correo eléctrónico
4 se visualiza el mensaje de error de correo inválid
5 se ingresa un correo ya registrado en el portal
6 se visualiza el mensaje de error que ya está registrado en el portal
7 se ingresa un correo que no está registrado en el portal
8 diligenciar los campos del formulario
9 hacer click en boton register




 */

public class Registro_de_usuario extends InicializarExploradores {

    @Test
    public void abrirPagina(){
        WebDriver driver = getDriverChrome("http://automationpractice.com/index.php");
    }

    @Test
    public void barradeBusqueda(){
        WebElement signIn = driver.findElement(By.xpath("//a[@title=\"Log in to your customer account\"]"));
        signIn.click();
        ((JavascriptExecutor)driver).executeScript("scroll(0,200)");
        driver.findElement(By.id("email_create")).sendKeys("jennifer");
        WebElement btnCreateAccount = driver.findElement(By.id("SubmitCreate"));
        btnCreateAccount.click();
        driver.findElement(By.id("email_create")).clear();
        driver.findElement(By.id("email_create")).sendKeys("jenniferandrea1089@hotmail.com");
        btnCreateAccount.click();
        driver.findElement(By.id("email_create")).clear();
        driver.findElement(By.id("email_create")).sendKeys("jhoba13210@gmail.com");
        btnCreateAccount.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Carlos");
        driver.findElement(By.id("customer_lastname")).sendKeys("Rocha Garcia");
        driver.findElement(By.id("passwd")).sendKeys("Amormio1404*");

        WebElement days=driver.findElement(By.name("days"));
        Select sel1 = new Select(days);
        sel1.selectByIndex(22);

        WebElement month=driver.findElement(By.name("months"));
        Select sel2 = new Select(month);
        sel2.selectByIndex(12);

        WebElement year=driver.findElement(By.id("years"));
        Select sel3 = new Select(year);
        sel3.selectByValue("1966");

        WebElement news = driver.findElement(By.id("newsletter"));
        news.click();
        WebElement offers = driver.findElement(By.id("optin"));
        offers.click();
        driver.findElement(By.id("company")).sendKeys("Empresa Test");
        driver.findElement(By.id("address1")).sendKeys("Carrera 42 # 45c sur - 31");
        driver.findElement(By.id("city")).sendKeys("Envigado");

        WebElement state = driver.findElement(By.id("id_state"));
        Select selState= new Select(state);
        selState.selectByIndex(17);

        driver.findElement(By.id("postcode")).sendKeys("05554");
        driver.findElement(By.id("other")).sendKeys("Esto es un comentario de prueba");
        driver.findElement(By.id("phone")).sendKeys("12345");
        driver.findElement(By.id("phone_mobile")).sendKeys("313000999");
        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys("Mi hogar");

        WebElement btnRegister = driver.findElement(By.id("submitAccount"));
        btnRegister.click();
    }

}


