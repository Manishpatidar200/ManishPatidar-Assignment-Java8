//1. Consider a scene we are having following series, 1,2,3,6,7,8,10,11,12,13,14,17,18,19,20 
//Now you need to print the output in following way
//1-3,6-8,10-14,17-20

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		int[] a = { 1, 2, 3, 6, 7, 9, 10, 11, 12, 13, 14, 17, 18, 19, 20 };
		for (int i = 0; i < a.length; i++) {
			int firstElement = a[i];
			int lastElement = 0;
			for (int j = i; j < a.length; j++) {
			//	System.out.println(a[j] + " " + a[j]);
				int arr = a[j] + 1;

				if (a.length == j + 1) {
					lastElement = a[j];
					i = j;
					break;
				} else {
					if (arr == a[j + 1]) {
					//	System.out.println("a[j] :" + a[j] + " /arrr :" + arr);
						continue;
					} else {
						lastElement = a[j];
						i = j;
						break;
					}

				}

			}

			list.add(firstElement + "-" + lastElement);

		}
		System.out.println(list);

	}

}
