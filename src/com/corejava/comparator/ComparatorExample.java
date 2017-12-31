package com.corejava.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*class SortByKeyAndValueAsc implements Comparator<Entry<Integer,String>>
{

	@Override
	public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
		if(o1.getKey()==o2.getKey())
			return o1.getValue().compareTo(o2.getValue());
		else 
			return o1.getKey()-o2.getKey();
	}
	
}
*/
class SortByValueDesc implements Comparator<Entry<Integer,String>>
{

	@Override
	public int compare(Entry<Integer,String> o1, Entry<Integer,String> o2) {
		return o2.getValue().compareTo(o1.getValue());
	}
}
class SortByValue implements Comparator<Entry<Integer,String>>
{

	@Override
	public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
		return o1.getValue().compareTo(o2.getValue());
	}
	
}
class SortByKey implements Comparator<Entry<Integer,String>>
{

	@Override
	public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
		// TODO Auto-generated method stub
		return o1.getKey()-o2.getKey();
	}
	
}
class SortByKeyDesc implements Comparator<Entry<Integer,String>>
{

	@Override
	public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
		return o2.getKey()-o1.getKey();
	}
	
}

public class ComparatorExample {

	public static void main(String[] args) {
		Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Vir");
		hm.put(19, "Raj");
		hm.put(11, "Rohit");
		hm.put(4,"Angel");
		hm.put(5, "Tag");
		hm.put(4,"Angee");
		hm.put(4, "Angat");
		hm.put(4,"Mohit");
		hm.put(4, "Mohan");
		System.out.println("Map before sorting");
		hm.entrySet().forEach((e)->System.out.println(e.getKey()+" "+e.getValue()));
		
		Set<Entry<Integer,String>> s=hm.entrySet();
		List<Entry<Integer,String>> l1=new ArrayList<>(s);
		Collections.sort(l1,new SortByValue());
		System.out.println("Map After SortByValue Asc");
		l1.forEach((k)->System.out.println(k.getKey()+" "+k.getValue()));
		
		Collections.sort(l1,new SortByValueDesc());
		System.out.println("Map After SortByValue Desc");
		l1.forEach((k)->System.out.println(k.getKey()+" "+k.getValue()));
		
		Collections.sort(l1,new SortByKey());
		System.out.println("Map After SortByKey Asc");
		l1.forEach((k)->System.out.println(k.getKey()+" "+k.getValue()));
		
		Collections.sort(l1,new SortByKeyDesc());
		System.out.println("Map After SortByKey Desc");
		l1.forEach((k)->System.out.println(k.getKey()+" "+k.getValue()));
		
		Collections.sort(l1,new SortByKeyDesc());
		System.out.println("Map After SortByKeyAndValue Asc");
		l1.forEach((k)->System.out.println(k.getKey()+" "+k.getValue()));
	}

}
