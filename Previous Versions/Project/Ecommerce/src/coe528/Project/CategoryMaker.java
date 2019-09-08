/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.javaproject;

import java.util.ArrayList;

/**
 *
 * @author Seanan
 */
public class CategoryMaker{
    private Categories electronics;
    private Categories clothing;
    private Categories sports;
    
    ArrayList products = new ArrayList<>();
    
    public CategoryMaker(){
        electronics = new Electronics();
        clothing = new Clothing();
        sports = new Sports();
    }
    
    public void search(){
        
    }
    public void viewElectronics(){
       electronics.products();
       electronics.viewproducts();
        
    }
    
    public void viewSports(){
       sports.products();
       sports.viewproducts();
    }
    
    public void viewClothing(){
        clothing.products();
        clothing.viewproducts();
    }
    
  
   
    
    
}
