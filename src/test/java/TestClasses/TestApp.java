/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestClasses;

import com.mycompany.chatterapp.Login;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class TestApp {
    
    @Test
    public void testUsername()
    {
     Login testLCL = new Login();
     testLCL.username = "Pie_t";
     
     
     boolean expected = testLCL.checkUserName();
     assertEquals(true, expected,"Expecting the username is correct");
    }        
    
    
    @Test
    public void testIncorretUsername()
    {
     Login testLCL = new Login();
     testLCL.username = "Piadat";
     
     boolean expected = testLCL.checkUserName();
     assertNotEquals(true, expected,"Expecting the username is incorectly formated"); 
    }        
    
     @Test
    public void testPassword()
    {       
    Login testLCL = new Login();
     testLCL.password = "Psadada*5";
     
     boolean expected = testLCL.checkPasswordComplexity();
     assertEquals(true, expected,"Expecting the pasword is correct");
    }        
    
     @Test
    public void testIncorrectPassword()
    {       
    Login testLCL = new Login();
     testLCL.password = "Psadada*";
     
     boolean expected = testLCL.checkPasswordComplexity();
     assertNotEquals(true, expected,"Expecting the pasword is incorrectly formated");
    }  
    
     @Test
    public void testPhoneNumber()
    {       
    Login testLCL = new Login();
     testLCL.phoneNumber = "+27680123434";
     
     boolean expected = testLCL.checkCellPhoneNumber();
     assertEquals(true, expected,"Expecting the phone number is correct");
    }  
    
    @Test
    public void testPhoneNumberIncorrect()
    {       
    Login testLCL = new Login();
     testLCL.phoneNumber = "+277801234345";
     
     boolean expected = testLCL.checkCellPhoneNumber();
     assertNotEquals(true, expected,"Expecting the phone number is incorrectly formated");
    }  
    
    @Test
    public void testLoginSuccessful()
    {       
    Login testLCL = new Login();
     testLCL.loginUsername = "Pie_t";
      testLCL.loginPassword = "Peanut8$";
     
     assertTrue(testLCL.loginUser());
    }  
    
     @Test
    public void testLoginFailed()
    {       
    Login testLCL = new Login();
     testLCL.loginUsername = "Piett";
      testLCL.loginPassword = "Peanuto$";
     
     assertFalse(testLCL.loginUser());
    }  
}

