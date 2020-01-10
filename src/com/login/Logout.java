/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

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
public class Logout {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "H:\\app\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/login.html");

        driver.manage().window().maximize();

        //driver.findElement(By.)
        driver.findElement(By.name("username")).sendKeys("zarin");
        driver.findElement(By.name("password")).sendKeys("123456");

        driver.findElement(By.name("login")).click();

        System.out.println("Login Successful");

        driver.findElement(By.className("logt")).click();
        System.out.println("Back to login page");
    }

}
