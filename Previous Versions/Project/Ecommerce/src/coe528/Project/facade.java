/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.Project;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Akash
 */
public class facade {
   
    private Categories a,b,c;
    
    public facade(){
    
        a = new Electronics();
        b = new Clothing();
        c = new Sports();
        this.create_categories();
}
    //customer related functions
    private void create_categories(){
        a.products();
        b.products();
        c.products();
    } 
    
    
   public void view_products()
   {
       int choice;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter Category :\n1.Electronics\n2.Clothing\n3.Sports");
       choice=s.nextInt();
       
   switch(choice)
   {
       case 1:                  
                a.viewproducts();break;
       case 2:  
                b.viewproducts();break;
       case 3:  
                c.viewproducts();break;           
       default: System.out.println("\nWrong choice entered");
   }
   
   }
    //public void pay(){
        //yet to be implemented
    //}    
    //manager related functions
    
    public void manager(){
        
    }
    
    public void customer(){
    
    }
    
    public void registered_customer(){

    }
    
    //cart related functions
    /*public abstract void add_to_cart();
    
    public abstract void view_cart();*/
    
}
