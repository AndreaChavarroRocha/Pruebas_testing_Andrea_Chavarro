package Prueba_Choucair;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
busqueda de producto en la página
1 ingresar al portal
2 realiza la búsqueda de productos
3 hacer click en la lupa de la barra
4 realizar búsqueda de producto haciendo enter

 */

public class Barra_busqueda extends InicializarExploradores{

    @Test
    public void abrirPagina(){
        WebDriver driver = getDriverChrome("http://automationpractice.com/index.php");
    }

    @Test
    public void barradeBusqueda(){
        driver.findElement(By.id("search_query_top")).sendKeys("Dress");
        WebElement btnSearch = driver.findElement(By.name("submit_search"));
        btnSearch.click();
        driver.findElement(By.id("search_query_top")).clear();
        driver.findElement(By.id("search_query_top")).sendKeys("Blouse");
        btnSearch = driver.findElement(By.name("submit_search"));
        btnSearch.sendKeys(Keys.ENTER);
        driver.findElement(By.id("search_query_top")).clear();
        driver.findElement(By.id("search_query_top")).sendKeys("Short");

    }
}
