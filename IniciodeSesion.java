package Prueba_Choucair;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
Ingreso al portal con usuario registrado, agregar direccion y abrir las opciones de MY ACCOUNT
1 ingresar emmail
2 ingresar pwd
3 hacer click en Add a new addresses
4 LLenar el formulario para la adición de nueva dirección
5 Hacer click en "Back to your account"
6 Seleccionar botón ORDER HISTORY AND DETAILS
7 regresar a la lista de opciones de MY ACCOUNT haciendo clicl botón Back to your account
8 Seleccionar opcion WISHLIST
9 regresar a la lista de opciones de MY ACCOUNT haciendo clicl botón Back to your account
10 Seleccionar opcion MY CREDIT SLIPS
11 regresar a la lista de opciones de MY ACCOUNT haciendo clicl botón Back to your account
12 Seleccionar MY PERSONAL INFORMATION
13 regresar a la lista de opciones de MY ACCOUNT haciendo clicl botón Back to your account
14 regressar al inicio haciendo click en el boton home



 */

public class IniciodeSesion extends InicializarExploradores{

    @Test
    public void IniciodeSesion(){
        //aqui se inicia la sesión con un usuario registrado

        WebDriver driver = getDriverChrome("http://automationpractice.com/index.php");
        WebElement signIn = driver.findElement(By.xpath("//a[@title=\"Log in to your customer account\"]"));
        signIn.click();
        driver.findElement(By.id("email")).sendKeys("jenniferandrea1089@hotmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Amormio1404*");
        WebElement btnSignIn = driver.findElement(By.id("SubmitLogin"));
        btnSignIn.click();
    }

    @Test
    public void adicionDeDireccionNueva (){
        //aqui se selecciona la opción de adicionar una direccion nueva
        //NOTA cada que se vaya a ejecutar este script, se debe actualizar el alias
        ((JavascriptExecutor)driver).executeScript("scroll(0,100)");
        WebElement myAddresses = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a"));
        myAddresses.click();

        WebElement addaNewAddresses = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[2]/a"));
        addaNewAddresses.click();
        ((JavascriptExecutor)driver).executeScript("scroll(0,200)");
        driver.findElement(By.id("address1")).sendKeys("AV 52 # 53-50 apto 601 Navarra");
        driver.findElement(By.id("address2")).sendKeys("Bello - copacabana");
        driver.findElement(By.id("city")).sendKeys("Bello");

        WebElement state = driver.findElement(By.id("id_state"));
        Select selState = new Select(state);
        selState.selectByIndex(40);

        driver.findElement(By.id("postcode")).sendKeys("00901");
        driver.findElement(By.id("phone")).sendKeys("1234567");
        driver.findElement(By.id("other")).sendKeys("esto es una prueba para creación de una segunda dirección");
        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys("Casa Madre");
        driver.findElement(By.id("submitAddress")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a")).click();
    }

    @Test
    public void opcionesMyAccount (){
        //aqui se navega por las diferentes opciones de MY ACCOUNT
        ((JavascriptExecutor)driver).executeScript("scroll(0,300)");
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a")).click();
        ((JavascriptExecutor)driver).executeScript("scroll(0,300)");
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[2]/ul/li/a")).click();
        ((JavascriptExecutor)driver).executeScript("scroll(0,300)");
        driver.findElement(By.xpath("//*[@id=\"mywishlist\"]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a")).click();
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a")).click();
        ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a")).click();







    }

}
