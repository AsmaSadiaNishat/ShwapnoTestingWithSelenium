/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author success
 */
public class MyCart {
    
    public MyCart(){
        
        
    
    
    System.setProperty("webdriver.chrome.driver", "H:\\app\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/view/mycart.html");

        driver.manage().window().maximize();

 
      driver.findElement(By.name("product")).sendKeys("Aarong Butter");
        driver.findElement(By.name("price")).sendKeys("250");
        
        driver.findElement(By.name("subtotal")).sendKeys("250");
        driver.findElement(By.name("shipping")).sendKeys("0");
        driver.findElement(By.name("total")).sendKeys("250");

       
        driver.findElement(By.name("submit")).click();


        System.out.println("Cart is saved Successfully");
        
        driver.close();
}
}
