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
     Login logCL = new Login();
     
     String userName;
     String passWord;
     String phoneNumber;
        
        System.out.println("------------------------------------");
         System.out.println("WELCOME TO THE CHATAPP LOGIN SECTION");
          System.out.println("------------------------------------");
           System.out.println("ENTER |YES| TO PROCEED WITH THE LOGIN");
            System.out.println("OR ENTER |NO| TO REGISTER!!! :D");
             
             
      String userInput = myScan.nextLine();
      
     while (!"YES".equals(userInput))
      {
          
       if ("NO".equals(userInput)) 
       {
       System.out.println("--------------------------------------------");    
        System.out.println("WELCOME TO THE REGISTER SECTION!!!");
         System.out.println("--------------------------------------------");
          System.out.println("PLEASE ENTER THE USER NAME YOU WANT TO USE! ");
           System.out.println("THE USER NAME MUST BE 5 CHARECTERS LONG AND");
            System.out.println("IT MUST INCLUDE A _ IN IT");
             System.out.println("EXAMPLE: Pie_t");
           
        userInput = myScan.nextLine();
        logCL.username = userInput;
        userName = userInput;
        
        System.out.println("--------------------------------------------");
         System.out.println("PLEASE ENTER A PASSWORD CONTAINING AT LEAST:");
          System.out.println("-8 CHARECTERS IN LENGTH OR MORE");
           System.out.println("-MUST HAVE AT LEAST 1 UPERCASE LETTER");
            System.out.println("-MUST HAVE AT LEAST 1 NUMMBER");
             System.out.println("-MUST HAVE AT LEAST 1 SPECIAL CHARRECTER");
              System.out.println("EXAMPLE: Peanut8$");
              
        userInput = myScan.nextLine();
        logCL.password = userInput;     
        passWord = userInput;
        
        System.out.println("--------------------------------------------");
         System.out.println("PLEASE ENTER A PHONE NUMBER CONTAINING:");
          System.out.println("THE SHOUTH AFRICAN COUNTRY CODE IN IT");
           System.out.println("EXAMPLE: +27824232723");
        
        userInput = myScan.nextLine();
        logCL.phoneNumber = userInput; 
        
        while (logCL.checkCellPhoneNumber() == false)
         {
          System.out.println("--------------------------------------------");
           System.out.println("WRONG CELL PHONE FORMATING !!! :):");
            System.out.println("PLEASE ENTER A |SA| PHONE NUMBER CONTAINING:");
             System.out.println("THE SHOUTH AFRICAN COUNTRY CODE IN IT");
              System.out.println("EXAMPLE: +27824232723");
            
          userInput = myScan.nextLine();
          phoneNumber = userInput;
          logCL.phoneNumber = userInput; 
          }  
          
        if(logCL.checkUserName() == true && logCL.checkPasswordComplexity() == true )
          {
           System.out.println(logCL.registerUser()); 
          } 
        
        
        while(logCL.checkPasswordComplexity() == false || logCL.checkUserName() == false)
         {             
             if(logCL.checkUserName() == false)
              {
               System.out.println("--------------------------------------------");    
                System.out.println(logCL.registerUser());
                 userInput = myScan.nextLine();
                  logCL.username = userInput;
                   userName = userInput; 
              }               
               if(logCL.checkPasswordComplexity() == false)
                {
                 System.out.println("--------------------------------------------");     
                  System.out.println(logCL.registerUser());
                   userInput = myScan.nextLine();
                    logCL.password = userInput;     
                     passWord = userInput;
                }   
         }
        
        
            
       }else
         {
          System.out.println("PLEASE INSERT (((YES))) IN CAPITAL LETTERS ");
           System.out.println("TO PROCEED WITH THE LOGIN GO TO THE LOGIN");
            System.out.println("OR INSERT ((((NO))) IN CAPITAL LETTERS TO");
             System.out.println("PROCEED TO THE REGISTER SECTION!!! :)");
              userInput = myScan.nextLine();   
         }
      }
        
            
    }  
}
