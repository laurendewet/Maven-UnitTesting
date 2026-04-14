/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatterapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Login {
    
public String username;
public String password;
public String phoneNumber;
public String loginUsername;
public String loginPassword;

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
     if(password.length() >= 8 && password.matches(".*[A-Z].*") &&
       password.matches(".*[0-9].*") && password.matches(".*[^a-zA-Z0-9].*")) 
        {
         return true; 
        }else
          {
           return false;   
          }
    }      
    //Resource for the SA phone number regex checker
    //https://stackoverflow.com/questions/4058001/validate-south-africa-cell-phone-number
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
           return username+" YOU ARE SUCCESSFULLY REGISTERD!!! :D";   
          } 
    return null;
    
    }
    //Resource used for this file reading:
    //https://youtu.be/C82HPlZ0ypw
    public boolean loginUser() 
     {
       //Boolean is false out of the try  becuase when the conditions for line 101 is met
       // It will change it to true if not it stays false
       //fileinfo is accesing the file path
        boolean LoginSuccess = false;
         File fileInfo = new File("usersinfo.txt");
    
         
                
      try
       {
       //Scanner is now scaning the userinfo.txt file    
        Scanner fileScan = new Scanner (fileInfo);
        
        //If there is still is next line contuni while loop
        while (fileScan.hasNextLine())
         {
          //Moves to the next line in the file and scans it and inserts it in userInfo
          String userInfo = fileScan.nextLine();
          //Array for the sections of user info(Pie_t,Peunut8$,+27812123232)
          //userinfo gets seprated by the comma then the info looks more like this{Pie_t, Peunut8$, +27812123232}
          //This makes it accesbile for the array to use 
          String[] section = userInfo.split(",");
           //Makes sure the section is 2 or more
           //Becuase it will give a error if there is no info in the next line
           if (section.length >= 2)
           {
             //varibles stores sections 1 and 2 of the array. First one stored is username next one passwor
            String fileUsername = section[0];
             String filePassword = section[1];
            //if the login info that the user name matches the two array sectiions then login is true 
            if(fileUsername.equals(loginUsername) && filePassword.equals(loginPassword))  
             {
              LoginSuccess = true; 
              break;
              } 
           }
         }  
        //Closes the scanner
        fileScan.close();
        //Handels errors like file missing
       }catch (FileNotFoundException errorRead)
        {
        } 
    return LoginSuccess == true;
     }
    
    public String returnLoginStatus()
     {
         if(loginUser() == true)
         {
             return "WELCOME "+ loginUsername  +" SUCCESSFULY LOGIN TO THE CHAT APP";
         }else
          {
           return "LOGIN FAILED";   
          }
     }  
}


