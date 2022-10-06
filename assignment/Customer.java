package com.valtech.training.assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
// Java Program to Sort LinkedList using Comparable
// in ascending order
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
 
// User defined class implements Comparable
class  Customer implements Comparable<Customer> {
    String name;
    int id;
    int type;
    int value;
    String joinDate;
 
    Customer(String name, int type, String joinDate, int value)
    {
        this.name = name;
        this.id = id;
        this.type = type;
        this.joinDate = joinDate;
        this.value = value;
        
    }
    
    public int maxDate(String date1,String date2) throws ParseException {
    	SimpleDateFormat sdformat = new SimpleDateFormat("dd-MM-yyyy");
    	Date d1 = sdformat.parse(date1);
        Date d2 = sdformat.parse(date2);
        
        
        if(d1.compareTo(d2) > 0) {
            return +1;
         } else if(d1.compareTo(d2) < 0) {
        	 return -1;
         }	
         else  {
             return 0;
          }
    }
    
    
    public int maxValue(int value1,int value2) {
    	
    	if(value1>value2) {return +1;}
    	if(value1<value2) {return -1;}
    	
		return 0;
    	
    }
    
 
    // Override the compareTo() method
    @Override 
    
    public int compareTo(Customer s)
    {
    	int maxDateReturn = 0;
    	int maxValueReturn = 0;
    	String joinDate1=s.joinDate;
    	int value1=s.value;
        if (type > s.type) {
            return 1;
        }
        else if (type == s.type) {
        	try {
        		maxDateReturn=maxDate(joinDate1, joinDate);
			} 
        	
        	catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	 if(maxDateReturn==+1) return -1;
             if(maxDateReturn==-1) return +1;
             if(maxDateReturn==0) {  
            	 maxValueReturn= maxValue(value1, value);
            	 if(maxValueReturn==+1) return +1;
            	 if(maxValueReturn==-1) return -1;
             }
             return 0;
        }
        else {
            return -1;
        }
    }
}
 
