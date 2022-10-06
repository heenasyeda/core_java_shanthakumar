package com.valtech.training.assignment;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class PasswordStrengthCheckerTest {

	@Test
	public void checklower() {
		PasswordStrengthChecker lwr=new PasswordStrengthChecker();
		    assertEquals(true, lwr.checklower("abcdefgh"));
		    }
	    

    @Test
    public void uppertest() {
	PasswordStrengthChecker upr=new PasswordStrengthChecker();
    assertEquals(true, upr.checkupper("ABCDEFGH"));
   }
    
    @Test
    public void checkdigit() {
	PasswordStrengthChecker dig=new PasswordStrengthChecker();
    assertEquals(false, dig.checkdigit("12345678"));
   }
    
    
    @Test
    public void checkspecialchar() {
	PasswordStrengthChecker spc=new PasswordStrengthChecker();
    assertEquals(false, spc.checkdigit("@#$%%%"));
   }
    
   }
		
	


