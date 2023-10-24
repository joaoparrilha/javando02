package genericsSetMap;

import java.util.ArrayList;
import java.util.List;

public class Covariancia {

	public static void main(String[] args) {
		
		// covariancia:quando GET é permitido mas o PUT não
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List <? extends Number> list = intList;
		
		Number x = list.get(0);
		//list.add(20);
		
		//contravariancia: quando PU é permitido, mas GET não
		List<Object> objList = new ArrayList<Object>();
		objList.add("Maria");
		objList.add("Alex");
		
		List <? super Number> myNums = objList;
		myNums.add(10);
		myNums.add(3.14);
		
		//Number x = myNums.get(0);
		
	}
}
