/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

import com.login.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

 /**
 *
 * @author 
 * ASMA SADIA NISHAT
 * ID: 16511050
 * Sec: B
 * BICE-2016
 * Dept. of ICT
 */
public class AddProduct {
    
    public AddProduct(){
        
        System.setProperty("webdriver.chrome.driver", "H:\\app\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/view/adminUpload.html");

        driver.manage().window().maximize();

        driver.findElement(By.name("product_id")).sendKeys("99");
        driver.findElement(By.name("product_name")).sendKeys("test");
        driver.findElement(By.name("weight")).sendKeys("200gm");
        driver.findElement(By.name("catagory")).sendKeys("Food");
        driver.findElement(By.name("product_size")).sendKeys("");
        driver.findElement(By.name("quantity")).sendKeys("10");
        driver.findElement(By.name("unit_price")).sendKeys("110");
        driver.findElement(By.name("file")).click();
        
        driver.findElement(By.name("insert")).click();
       // System.out.println("Visiting Home Page of Shwapno");
        
        driver.close();
    }

}
