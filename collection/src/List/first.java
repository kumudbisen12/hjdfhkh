package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class first {

	public static void main(String[] args) 
	{
		System.out.println("me to");
		System.out.println("me");
		List <String> mh = new ArrayList();
		mh.add("Pune");
		mh.add("Nagpur");
		
		List <String> mp = new ArrayList();
		mp.add("Jabalpur");
		mp.add("Bhopal");
		
		List <List <String>> India = new ArrayList();
		India.add(mh);
		India.add(mp);
		
		Iterator <List <String>> itr = India.iterator();
		while (itr.hasNext())
		{
			List <String> list = itr.next();
			Iterator<String> itr1 =list.iterator();
			while (itr1.hasNext())
			{
				String val = itr1.next();
				System.out.println(val);
				
			}
		}
		

	}

}
