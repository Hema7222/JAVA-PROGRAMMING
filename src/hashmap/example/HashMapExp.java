package hashmap.example;

import java.util.HashMap;
 

public class HashMapExp {
	static boolean answer = "false" != null;

	public static void main(String[] args) {
	HashMap<String, String> h = new HashMap<String,String>();
	h.put("Name", "Hema");
	h.put("age", "24");
	h.put("gender", "female");
	h.put("etc","...");
	
	System.out.println(h.get("Name"));
	System.out.println(h.get("age"));
	System.out.println(h.get("gender"));
	System.out.println(h.get("etc"));
	
	System.out.println("contains: "+h.containsKey("address"));
	System.out.println("remove age: "+h.remove("age"));
	System.out.println("age is there or not: "+h.containsKey("age"));

	System.out.println(h.replace("Name", "Hema", "Hp"));
	System.out.println("key: "+h.keySet());
	System.out.println(h.containsKey("age"));
	System.out.println("values: "+h.values());
	
	System.out.println("get: "+h.get("name"));
	
	System.out.println("clone: "+h.clone());
	System.out.println(h.entrySet());            //key and value --> 2d array it will print
	System.out.println(h.containsValue("hema"));
	
	
	
	System.out.println("equals: "+h.equals("hema"));
	
	String search ="Name";
	
	
	h.forEach((key, value) ->
	{
		if(key.contains(search)|| value.contains(search)) {
			answer = true;
		}
	});
	System.out.println(search+" contains "+answer);
	}

}
