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
    
String username;
String password;
String phoneNumber;
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
    
    }
    
    public boolean loginUser()
     {
        
     }
     
}
