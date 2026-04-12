/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatterapp;
import java.util.Scanner ;

/**
 *
 * @author lab_services_student
 */
public class ChatterApp {

    public static void main(String[] args) {
        
      Scanner myScan = new Scanner(System.in);
      
      String userName = "Jacob"; // Datbase replacement
       String password = "fst34tr4S"; // Datbase replacement
        String phoneNummber = "+27773603619" ; //Datbase replacement
        
        System.out.println("------------------------------------");
         System.out.println("WELCOME TO THE CHATAPP LOGIN SECTION");
          System.out.println("------------------------------------");
           System.out.println("ENTER |YES| TO PROCEED WITH THE LOGIN");
            System.out.println("OR ENTER |NO| TO REGISTER!!! :D");
             
             
      String userInput = myScan.next();
      
     while (userInput != "YES")
      {
       if (userInput = "NO") 
       {
          
       } 
        else
         {
          System.out.println("PLEASE INSERT (((YES))) IN CAPITAL LETTERS ");
           System.out.println("TO PROCEED WITH THE LOGIN GO TO THE LOGIN");
            System.out.println("OR INSERT ((((NO))) IN CAPITAL LETTERS TO");
             System.out.println("PROCEED TO THE REGISTER SECTION!!! :)");
          userInput = myScan.next();   
         }
      }
        
            
    }  
}
