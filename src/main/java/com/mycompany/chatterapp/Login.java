/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatterapp;

/**
 *
 * @author lab_services_student
 */
public class Login {
    
String Username;
String Password;
    public boolean checkUserName()
     {   
      if(Username.contains("_") && Username.length() == 5) 
       {
         return true;
       }else
        {
        return false;  
        }
     }
    
    public boolean checkPasswordComplexity()
    {
     if(Password.length() <= 8 && Password.matches(".*[A-Z].*") &&
       Password.matches(".*[0-9].*") && Password.matches(".*[^a-zA-Z0-9].*")) 
        {
         return true; 
        }else
          {
           return false;   
          }
    }      
    
}
