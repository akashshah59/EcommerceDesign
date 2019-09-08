/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.Project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Akash
 */
public class login {
    static Scanner s=new Scanner(System.in);
    static File f1,f2;
    static FileReader fr;
    static BufferedReader br;
    static String username,password,line;
    public login()
    {
        username="";
        password="";
        f1=new File("username.txt");
        f2=new File("password.txt");           
    }
    public void enter_username() throws FileNotFoundException, IOException
    {
         System.out.println("\nEnter username");
         username=s.nextLine();
         fr=new FileReader(f1);
         br=new BufferedReader(fr);

         while((line=br.readLine())!=null)
         { if(line.equals(username))
                  break;
          
         System.out.println("");
         }
         System.out.println("\nUsername found,Now checking password...");
    }
    public void enter_password() throws FileNotFoundException, IOException
    {
         System.out.println("Enter password");  
         password=s.next();
         fr=new FileReader(f2);
         br=new BufferedReader(fr);
         while((line=br.readLine())!=null)
         {   if(line.equals(password))
                  break;         
             System.out.println("");
         }
             System.out.println("\nPassword checked,Now logging in...");                 
    }
    
    public void role()
    {
        if("admin".equals(username) && "admin".equals(password))
        {
            System.out.println("\nLogged in as manager");
            manager m=new manager();
        
        }
        else 
        {
            System.out.println("\nLogged in as Registered Customer");
            registered_customer rc=new registered_customer();
        }
    }
    
}
