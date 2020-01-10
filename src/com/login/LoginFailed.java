/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

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
public class LoginFailed {
    
    public LoginFailed(){

        System.setProperty("webdriver.chrome.driver", "H:\\app\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/view/adminLogin.jsp");
        
        driver.manage().window().maximize();
        
        //driver.findElement(By.)
        driver.findElement(By.name("username")).sendKeys("random_value");
        driver.findElement(By.name("password")).sendKeys("123");
        
        driver.findElement(By.name("login")).click();

        System.out.println ("Login Failed!");
        //driver.wait(5000);
        driver.close();
    }
}


