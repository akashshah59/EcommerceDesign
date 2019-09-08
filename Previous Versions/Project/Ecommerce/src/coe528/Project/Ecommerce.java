/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.Project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Akash
 */
public class Ecommerce {

    /**
     * @param args the command line arguments
     */
    static login l1=null,l2=null;
    static customer c;
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
    //login information present    
    int option=0; 
    Scanner s = new Scanner(System.in);
    FileWriter fw;
    BufferedWriter bw;
    File f=new File("username.txt");
    f.createNewFile();
    fw=new FileWriter(f);
    bw=new BufferedWriter(fw);
    bw.write("admin");
    bw.flush();
    fw.close();
    
    f=new File("password.txt");
    fw=new FileWriter(f);
    bw=new BufferedWriter(fw);
    bw.write("admin");
    bw.flush();
    fw.close();
    
    System.out.println("SELECT your option:\n");
    System.out.println("1.Login as customer\n2.Login as manager\n3.Buy\n4.Register\n ");
    option=s.nextInt();
    
    switch(option)
{
    case 1: l1=new login();l1.enter_username();l1.enter_password();l1.role();break;
    case 2:l2=new login();l2.enter_username();l2.enter_password();l2.role();break;
    case 3:c=new customer();break;
    case 4:System.out.println("Enter your username and password");break;            
    default:System.out.println("Enter a legit option");
}
    
    // login l=new login()    
    }    
}
