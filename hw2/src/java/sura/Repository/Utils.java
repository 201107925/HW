/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sura.Repository;



import java.net.URL;
import java.util.Scanner;

public class Utils { 

    public static String readUrl(String urlString) {
        String content = "";
        try {
            //What is "\\A"? => read https://weblogs.java.net/blog/pat/archive/2004/10/stupid_scanner.html
            content = new Scanner(new URL(urlString).openStream(), "UTF-8").useDelimiter("\\A").next();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return content;
    }
}
