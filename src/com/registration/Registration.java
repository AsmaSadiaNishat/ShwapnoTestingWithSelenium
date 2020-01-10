/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registration;

import com.login.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 *
 * @author 
 * ASMA SADIA NISHAT
 * ID: 16511050
 * Sec: B
 * BICE-2016
 * Dept. of ICT
 */
public class Registration {

    public Registration() {

        System.setProperty("webdriver.chrome.driver", "H:\\app\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/register.html");

        driver.manage().window().maximize();

 
      //  driver.findElement(By.name("reg")).click();
        
        driver.findElement(By.name("username")).sendKeys("nishat");
        driver.findElement(By.name("useremail")).sendKeys("nishat@gmail.com");
        
        driver.findElement(By.name("usermobile")).sendKeys("01623755777");
        driver.findElement(By.name("password")).sendKeys("nishat");

       
        driver.findElement(By.name("submit")).click();


        System.out.println("Register Successful");
        
        driver.close();

    }

}
