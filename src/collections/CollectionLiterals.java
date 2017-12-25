package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> weekDays = Map.of(
			1,"Domingo",
			2,"Segunda",
			3,"Terça"
		);
		
		Map.ofEntries(
			Map.entry(1, "Domingo"),
			Map.entry(2, "Seguna")
		);
		
		List name = List.of("Mário", "Santos", "Sousa");
		//throws an UnsupportedOperationException
		//name.add("new nome"); 
		
		//Compilation error ArrayList.of("","");
		
		
		Set.of("White", "Black", "Yellow");
		
		Set.of(null);//throws a NullPointerException
	}

}
