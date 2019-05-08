package set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fouth {

	public static void main(String[] args) 
	{
		List <Integer> list = new ArrayList();
		list.add(5);
		list.add(6);
		list.add(9);
		list.add(8);
		
		/*Iterator<Integer> itr = list.iterator();
		while(itr.hasNext())
		{
			Integer A = itr.next();
			System.out.println(A);
		}
		*/
		for (Integer A : list)
		{
			System.out.println(A);
		}
	

	}

}
