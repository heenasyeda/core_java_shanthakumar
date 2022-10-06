package com.valtech.training.assignment;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void test() {
		 TreeSet<Customer> set = new TreeSet<Customer>();
		 int Dimond=1,Platinum=2,Gold=3,Silver=4;

		 Customer c1 = new Customer("Heena",Platinum,"2-2-2022",2000);
		 Customer c2 = new Customer("Ameena", Dimond, "24-4-2020",1500);
		 Customer c3 = new Customer("Rafiya", Silver, "3-10-2021",1000);
		 Customer c4 = new Customer("fazil",Gold, "21-3-2020",1200);
		 Customer c5 = new Customer("Saqlain",Platinum,"13-3-2020",1000);
		 Customer c6 = new Customer("Razzaq", Silver, "26-3-2020",1000);
		 Customer c7 = new Customer("Mariyam", Platinum, "23-3-2019",1000);
		 Customer c8 = new Customer("Mustafina",Silver, "21-3-2022",1000);
		 Customer c9 = new Customer("Touseef", Gold, "24-3-2020",1000);
		 Customer c10 = new Customer("Azam", Dimond, "24-4-2020",2000);
	  
	        set.add(c1);
	        set.add(c2);
	        set.add(c3);
	        set.add(c4);
	        set.add(c5);
	        set.add(c6);
	        set.add(c7);
	        set.add(c8);
	        set.add(c9);
	        set.add(c10);
		
    
    System.out.println("Sorted List");
    int count=0;
    for (Customer s : set) {
    	
        // Print the sorted LinkedList
        System.out.println(convert(s.type) + " " + s.name + " "
                           + s.joinDate+  " "+s.value);
        count++;
    }
    
   
    assertEquals(count, set.size());
    
	}
	 public String convert(int a) {
		 
		 switch(a) {
		 case 1:
			 return "Dimond";
		 case 2:
			 return "Platinum";
		 case 3:
			 return "Gold";
		 case 4:
			 return "Silver";
		 }
		 return "null";
	    	
	    }
	}


