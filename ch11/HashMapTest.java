package ch11;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("Marcus Miller", "Power");
		map.put("Victor Wooten", "Stomping Ground");
		map.put("Vincen Garcia", "Aprieta");
		map.put("Naruse Yoshihiro + Sutoh Mitsuru", "Eccentric Games");
		
		for(var entry : map.entrySet()) {
			System.out.println(
				"Name: " + entry.getKey() +
				", Signature: " + entry.getValue()
			);
		}
		
		System.out.println("Beloved Bassists: "+ map.keySet());
		int total = 0;
		int count = 0;
		for(String value : map.values()) {
			for(char c : value.toCharArray()) {
				count ++;
				total += (int)c;
			}
		}
		System.out.println();
		System.out.println("Total: " + total);
		System.out.println("Count: " + count);
		System.out.println("Average: " + total / (double)count);
	}
}
