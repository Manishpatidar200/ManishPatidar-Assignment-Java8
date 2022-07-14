package com.java8Assinment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	 public static void main(String[] args)
	    {
	  
	        
	        List<Employee>
	            lt = new ArrayList<Employee>();
	  
	        
	        lt.add(new Employee(1, "Dharmesh"));
	        lt.add(new Employee(2, "Anuj"));
	        lt.add(new Employee(3, "Harshal"));
	        lt.add(new Employee(4, "Atul"));
	        lt.add(new Employee(5, "Sourbh"));
	        
	        Map<Integer, String> map = new HashMap<Integer, String>();
	  
	     
	        for (Employee emp : lt) {
	            map.put(emp.getId(), emp.getName());
	        }
	  
	       
	        System.out.println("Map  : " + map);
	    }
}
