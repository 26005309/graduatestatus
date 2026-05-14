/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.graduatestatus;
/**
 *
 * @author 26005309
 */
import java.util.Scanner;
public class Graduatestatus {

    public static void main(String[] args) {
        
        
    Scanner inputDevice = new Scanner(System.in);
        double marks;
        
     System.out.println("ENTER YOUR MARKS" );
     marks = inputDevice.nextDouble();
     
     if (marks >=65){
     System.out.println("QUALIFIED!! TO GRADUATE!!");
     }
     else {
     System.out.println("NOT QUALIFIED!! TO GRADUATE!! ");
     }      
                
             
        
        
    
        
    }
}
