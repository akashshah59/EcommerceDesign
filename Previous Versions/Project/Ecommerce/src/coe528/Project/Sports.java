/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.Project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Seanan
 */
public class Sports extends Categories {

    List<String> sports = new ArrayList<>();

    public List products() {

        //check if file is empty if it then do the following.
        try {
            BufferedReader br = new BufferedReader(new FileReader("sports.txt"));
            if (br.readLine() == null) {
                BufferedWriter out = new BufferedWriter(new FileWriter("sports.txt"));
                for (int i = 0; i < 20; i++) {
                    out.append("Sports Product " + i + "\n");
                    out.newLine();
                }
                out.close();
            } else {
                BufferedReader in = null;

                try {
                    in = new BufferedReader(new FileReader("sports.txt"));
                    String str;
                    while ((str = in.readLine()) != null) {
                        sports.add(str);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (in != null) {
                        in.close();
                    }
                }
            }
        } catch (IOException e) {
        }
        return sports;
    }

  public void searchproducts(String input) {
        for (int i = 0; i <= sports.size(); i++) {
            sports.get(i).contentEquals(input);
            System.out.println(sports.get(i));
        }

    }

    public void viewproducts() {
        for (String name : sports) {
            System.out.println(name);
        }
    }

}
