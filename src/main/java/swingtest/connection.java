/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author ali
 */
public class connection {
    public String ss(String value){ 
            String s= "";
            
            // iqd is jcombo list
            try {
                URL url = new URL("https://api.exchangerate.host/latest?symbols=USD,"+ value);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");
                con.connect();         
                // get the request as string
                InputStreamReader in = new InputStreamReader(con.getInputStream());
                BufferedReader br = new BufferedReader(in);
                s = br.readLine();
            
        }catch(Exception e){
            e.printStackTrace();
        }
            return s;
        }
}
