package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Third {

	public static void main(String[] args) 
	{
	 List list = new ArrayList();
	 list.add(12);
	 list.add(45);
	 list.add(12);
	 list.add(65);
	 list.add(89);
	 list.add(45);
	 
	 //How to sort List element with duplicates also
	 Collections.sort(list);
	 System.out.println(list);
	 
		
		
	}

}
