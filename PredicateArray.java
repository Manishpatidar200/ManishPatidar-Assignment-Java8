//9. WAP to implement predicate to check given list of array contain how many even and odd 
//nos

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateArr implements Predicate<Integer> {
	
	int even=0;
	int odd=0;
	@Override
	public boolean test(Integer a) {
		if(a%2==0)
		{
			even++;
			return true;
		}
		else
		{
			odd++;
			return false;
		}
	}

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(43,56,34,55,23,87,50,61,62);
		PredicateArray obj=new PredicateArray();
		for(int i:list)
		{
			obj.test(i);
		}
		System.out.println("Even number: "+obj.even);
		System.out.println("Odd number: "+obj.odd);
		
	}

	
}


