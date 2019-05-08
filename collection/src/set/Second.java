package set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Second {

	public static void main(String[] args) 
	{
		List list = new ArrayList();
		list.add(12);
		list.add(45);
		list.add(44);
		list.add(12);
		
		//How to sort list element without duplicates
		
		Set s = new TreeSet(list);
		System.out.println(s);

	}

}
