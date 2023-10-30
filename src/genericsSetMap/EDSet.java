package genericsSetMap;

import java.util.HashSet;
import java.util.Set;

public class EDSet {
	
	public static void main(String[] args) {
		// HashSet, TreeSet, LinkedHashSet
		Set <String>set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		System.out.println(set.contains("Notebook"));
		
		//set.remove("Tablet");
		set.removeIf(x -> x.length() >= 3);
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
