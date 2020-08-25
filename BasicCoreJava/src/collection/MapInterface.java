package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		
		Map<String, String> map= new Hashtable<>();
		
		map.put("name", "Prachee");
		map.put("email", "Prachee1234@gmail.com");
		map.put(null,"jhgjhghg");
		
		System.out.println(map.get("name"));
		System.out.println(map.get("email"));
		System.out.println(map.get(null));
		
		

	}

}
