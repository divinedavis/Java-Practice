/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package more.practice;

/**
 *
 * @author divineDavis
 */
public class MorePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte byt = 99;
        short sht = 24513;
        int integ = 456767133;
        long lng = 1234578696;
        
        System.out.println("Byte: " + byt + "\nShort: " + sht + "\nInt: " + integ + "\nLong: " + lng);
        
        int weights [] = new int [100];
        
        weights [0] = 125;
        weights [1] = 223;
        weights [2] = 214;
        weights [3] = 200;
        weights [4] = 189;
        weights [5] = 112;
        weights [6] = 214;
        weights [7] = 200;
        weights [8] = 189;
        weights [9] = 112;
        
        System.out.println(weights[0] + " " + weights[1] + " " + weights[2]);
        
        weights [4] = 111;
        weights [5] = 123;
        
        System.out.println(weights[4] + " " + weights[5] + " " );
        
        weights [5] = 100;
        int num = weights [5];
        
        int sum = 0;
        for (int i = 0; i < 10; i++)
        {
            sum = sum + weights[i];
            System.out.println("Sum: " + sum);
        }
    }
    
}
