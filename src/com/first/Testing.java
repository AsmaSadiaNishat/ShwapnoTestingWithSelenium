/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.first;

import com.home.AddProduct;
import com.home.HomePage;
import com.home.MyCart;
import com.home.ViewProduct;
import com.login.*;
import com.registration.*;
import javax.swing.JOptionPane;

/**
 *
 *
 *
 */
public class Testing {

    public static void main(String args[]) {

        JOptionPane.showMessageDialog(null, "Visiting Home Page of Shwapno");
        new HomePage();
        JOptionPane.showMessageDialog(null, "Successfully Visited");

        JOptionPane.showMessageDialog(null, "Admin Login Failed Testing");
        new LoginFailed();
        JOptionPane.showMessageDialog(null, "Admin Login Failed Testing OK");

        JOptionPane.showMessageDialog(null, "Admin Login Successful Testing");
        new LoginSuccess();
        JOptionPane.showMessageDialog(null, "Admin Login Successful Testing OK");

        
        JOptionPane.showMessageDialog(null, "Registration Testing");
        new Registration();
        JOptionPane.showMessageDialog(null, "Registration Testing OK");
        
        
        
        JOptionPane.showMessageDialog(null, "View Product Testing");
        new ViewProduct();
        JOptionPane.showMessageDialog(null, "Products are viewed");
        
        
        JOptionPane.showMessageDialog(null, "Cart Testing");
        new MyCart();
        JOptionPane.showMessageDialog(null, "Cart Testing OK");
        
        JOptionPane.showMessageDialog(null, "Add Product Testing");
        new AddProduct();
        JOptionPane.showMessageDialog(null, "Product is added successfully");
    }

}
