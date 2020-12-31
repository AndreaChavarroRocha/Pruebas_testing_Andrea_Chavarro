package Prueba_Choucair;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Keys;
import java.io.File;
import java.util.Scanner;

public class InicializarExploradores {
    WebDriver driver;


    public WebDriver getDriverChrome(String URL){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        return driver;
    }

    public WebDriver getDriverFirefox(String URL){
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(URL);
        return driver;
    }

    public WebDriver getDriverEdge (String URL){
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get(URL);
        return driver;
    }
}