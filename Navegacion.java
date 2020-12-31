package Prueba_Choucair;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*En esta prueba de navegación se ralizará
1 apertura del navegador en la url de new experience
2 se maximiza la ventana del navegador
3 se hace scroll vertical hasta la parte central donde se localizan los productos
4 se hace clic en uno de los productos abriendo el quick view del producto
5 cerrar el modal del detalle del producto
6 hacer scroll hacia arriba
7 Hacer click en sección WOMEN
8 Hacer scroll en la sección
9 se hace clic en uno de los productos abriendo el quick view del producto
10 cerral el modal del detalle del producto
11 hacer scroll hacia abajo
12 hacer click en all specials
13 hacer click en seleccion de vista en lista
14 hacer sroll hacia arriba
15 hacer click en contact us
16 devolver atras la página
17 ir al home usando el logo de la marca
*/

public class Navegacion extends InicializarExploradores{

    @Test
    public void abrirPagina(){
        WebDriver driver = getDriverChrome("http://automationpractice.com/index.php");
    }

    @Test
    public void navegarEnPortal(){
        ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
        WebElement img = driver.findElement(By.className("product_img_link"));
        img.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement close = driver.findElement(By.xpath("//a[@title=\"Close\"]"));
        close.click();
        ((JavascriptExecutor)driver).executeScript("scroll(0,100)");
        WebElement seccion = driver.findElement(By.xpath("//a[@title=\"Women\"]"));
        seccion.click();
        ((JavascriptExecutor)driver).executeScript("scroll(0,1500)");
        WebElement img2 = driver.findElement(By.xpath("//img[@src=\"http://automationpractice.com/img/p/1/0/10-home_default.jpg\"]"));
        img2.click();
        WebElement close2 = driver.findElement(By.xpath("//a[@title=\"Close\"]"));
        close2.click();
        ((JavascriptExecutor)driver).executeScript("scroll(0,1900)");
        WebElement allEspecials = driver.findElement(By.xpath("//a[@title=\"All specials\"]"));
        allEspecials.click();
        ((JavascriptExecutor)driver).executeScript("scroll(0,300)");
        WebElement viewList = driver.findElement(By.xpath("//i[@class=\"icon-th-list\"]"));
        viewList.click();
        ((JavascriptExecutor)driver).executeScript("scroll(0,0)");
        WebElement contactUs = driver.findElement(By.xpath("//a[@title=\"Contact Us\"]"));
        contactUs.click();
        ((JavascriptExecutor)driver).executeScript("scroll(0,300)");
        driver.navigate().back();
        WebElement home = driver.findElement(By.xpath("//img[@src=\"http://automationpractice.com/img/logo.jpg\"]"));
        home.click();
    }
}
