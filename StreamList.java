//3. WAP to take name of employee, sort all employee name using stream and print only unique 
//name from it.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamList {

	public static void main(String[] args) {
		List < String > employees = new ArrayList < String > ();
  try(Scanner sc= new Scanner(System.in)){
	  System.out.println("enter the name of employees");
	  for(int i=0;i<7;i++)
	  {
		  employees.add(sc.next());
	  }
  }
        // sort employee by salary in ascending order
        
      

        
        List < String > employeesSortedList2 = employees.stream()
            .sorted().distinct().collect(Collectors.toList()); //ascending order
        System.out.println("the name of distint employeesamay");
        System.out.println(employeesSortedList2);
    }	
}
