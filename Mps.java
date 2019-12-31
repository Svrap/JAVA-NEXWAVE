package test;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Mps {
	public static void main(String [] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("abc@gmail.com", "abc@123");
		map.put("xyz@xxx.com", "1234");
		map.put("def@xyz.com","xyz");
		map.put("ghi@xyz.com","xyz");
		System.out.println(map.size());
		System.out.println(map.get("ghi@xyz.com"));
	//using lambda and stream api
		map.forEach((k, v) -> {
            System.out.println("Key: " + k + ", Value: " + v);
        });
		System.out.println("\nusing entry method\n");
	//using entry method
		Set<Entry<String,String>> set = map.entrySet();
		for(Entry<String,String> s : set)
				System.out.println(s.getKey()+""+s.getValue());
	}

}
