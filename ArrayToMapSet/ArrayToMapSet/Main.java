package com.assignment.ArrayToMapSet;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args)
	{

		// create a list
		List<Employee> list = new ArrayList<>();

		// add the member of list
		list.add(new Employee(1, "Ram"));
		list.add(new Employee(2, "Shyam"));
		list.add(new Employee(3, "kapil"));
		list.add(new Employee(4, "Lakhan"));
		list.add(new Employee(5, "Pinky"));
		list.add(new Employee(6, "Manish"));
		list.add(new Employee(7, "Ravi"));
		list.add(new Employee(8, "Renu"));
		list.add(new Employee(9, "Riya"));
		list.add(new Employee(10, "Vaibhav"));
		

		// create map with the help of
		// Collectors.toMap() method
		LinkedHashMap<Integer, String>
			map = list.stream()
					.collect(
						Collectors
							.toMap(
									Employee::getId,
									Employee::getName,
								(x, y)
									-> x + ", " + y,
								LinkedHashMap::new));

		// print map
		map.forEach(
			(x, y) -> System.out.println(x + "=" + y));
	}
}
