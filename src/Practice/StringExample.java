package Practice;

public class StringExample {
	public void example(String b, String a, String c){
		String str2 = b.replace("welcome", "w e l c o m e");
		String str1 = a.replace("hello world", "hello all");
		System.out.println(str2);
		System.out.println(str1);
		//String str3 = c.replaceAll("welcome hello world", "helloworld");
		String str3 = c.replaceFirst("welcome hello world", "helloworld");
		System.out.println(str3);
	}
}
