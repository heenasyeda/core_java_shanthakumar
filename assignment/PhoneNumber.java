package com.valtech.training.assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
	int cnt1=0;
	private int checkNum(long a) {
		
		String a1=String.valueOf(a);
		 if( a1.matches("(0/91)?[6-9][0-9]{9}") ) {
		      return 1;	
			}
		return 0;
	}
	
	
	public int order(long a){
		long val = a;
		 int res = 0;
		 int value=1;
		 int value1=0;
		String data=Long.toString(a);
		
	if( data.matches("^(\\d)\\1+{2}$") ) {
		      return 100;	
			}
	if( a==1234567890L|| a==9876543210L ) {
	    System.out.println("100"); 
		return 100;	
		}
	
	else if(data.matches("[0-9][0-9]+.")){
		 int cnt[] = new int[10];
		 
		 while (val > 0)
		    {
		  
		        int rem = (int) (val % 10);
		  
		        cnt[rem]++;
		  
		        val = val / 10;
		    }
		  
		    for (int i = 0; i < 10; i++)
		    {
		  
		        if (cnt[i] > 1)
		        {
		  
		            res++;
		        }
		    }
		  
		
		for(int i=0;i<10;i++)
		{
			if(cnt[i]>1) {
				value*=cnt[i];
				value1+=cnt[i];
			}
			
			
		}

	}
	System.out.println(res);
	System.out.println(value);
	System.out.println(value*res);
	if(res==1 && value>=5)
	{
		return value*res*10;
	}
	
	return value*res;
	
	
	}

	
	
public boolean check(long a) {
		
	if (checkNum(a)==1) {
		 
        // Print statement
        System.out.println("Valid Number");
        
        int a1=order(a);
        

       System.out.println(a1);
       System.out.println(series(a));
		return true;
	}
	
	
	
	
	
    else {
        System.out.println("Invalid Number");
	return false;
	
    }
}
private int series(long a) {
	int arr[]=new int[10],i=9;
			
//	String data=Long.toString(a);
	if( a==1234567890L|| a==9876543210L ) {
	    System.out.println("100"); 
		return 100;	
		}
	else {
		while(a!=0) {
			arr[i--]= (int) (a % 10);
			a=a/10;
			//System.out.println("hii");
		}
		for(int j=0;j<10;j++) {
			//System.out.println(arr[j]);
			if(arr[j+1]-arr[j]==1) {
				cnt1++;
			}
		}
		
	}
	return 0;
	
}

}
