/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatterapp;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Login {
    
String username;
String password;
String phoneNumber;
String loginUsername;
String loginPassword;

    public boolean checkUserName()
     {   
      if(username.contains("_") && username.length() == 5) 
       {
         return true;
       }else
        {
        return false;  
        }
     }
    
    public boolean checkPasswordComplexity()
    {
     if(password.length() <= 8 && password.matches(".*[A-Z].*") &&
       password.matches(".*[0-9].*") && password.matches(".*[^a-zA-Z0-9].*")) 
        {
         return true; 
        }else
          {
           return false;   
          }
    }      
    
     public boolean checkCellPhoneNumber()
    {
     if(phoneNumber.matches("^\\+27[6-8][0-9]{8}$")) 
        {
         return true; 
        }else
          {
           return false;   
          }
    }
    
    public String registerUser()
    {
        
        if(checkUserName() == false)
        {
         return "THE USERNAME IS INCORRECT! PLEASE ENTER A _ AND\nTHE LENGTH MUST BE 5 CHARRECTERS LONG :)"  ; 
        }
        
        if(checkPasswordComplexity() == false )
          {
           return "THE PASSWORD IS INCORRECT! THE PASSWORD DOES\nNOT MEET THE COMPLEXITY REQUIREMENTS :)"  ;  
          }  
        
        if(checkUserName() == true && checkPasswordComplexity() == true )
          {
           return "YOUR SUCCESSFULLY REGISTERD!!! :D";   
          } 
    return null;
    
    }
    
    public boolean loginUser() 
     {
         boolean LoginSuccess = false;
         
         File fileInfo = new File("userInfo.txt");
    
         
                
      try
       {
        Scanner fileScan = new Scanner (fileInfo);
        
        while (fileScan.hasNextLine())
         {
          String userInfo = fileScan.nextLine();
           String[] section = userInfo.split(",");
           
           if (section.length >= 2)
           {
            String fileUsername = section[0];
             String filePassword = section[1];
             
            if(fileUsername.equals(loginUsername) && filePassword.equals(loginPassword))  
             {
              LoginSuccess = true; 
              break;
              } 
           }
         }  
        fileScan.close();
       }catch (Exception errorRead)
        {
        errorRead.printStackTrace();
        } 
       if(LoginSuccess == true)
        {
         return true;
        }else
         {
          return false;       
         }
     }
}


