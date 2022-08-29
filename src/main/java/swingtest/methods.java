/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingtest;

/**
 *
 * @author ali
 */
public class methods {

    public double usd(String s) {
        //format the string
        String ss = s.substring(s.indexOf("rates"), s.length() - 1);
        String[] arr = ss.split("[, { : } ]");

        // convert string to double
        double usd = Double.parseDouble(arr[arr.length - 1]);

        return usd;
    }
    
    public double value1(String s){
        //format the string
        String ss = s.substring(s.indexOf("rates"), s.length() - 1);
        String[] arr = ss.split("[, { : } ]");
        
        // convert it to double
        double value = Double.parseDouble(arr[arr.length - 3]);
   
        return value;
    }
    
    public double amount(String s){
        return Double.parseDouble(s);
    }
    
    public double result(double amount, double usd, double value){
        double result = (amount*usd)*value;
//        System.out.println(result);
        return result;
    }
}