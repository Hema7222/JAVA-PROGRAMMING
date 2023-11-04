/*package class1_program;

public class Character_methods {

	public static void main(String[] args) {
		System.out.println("java\tprog");
		System.out.println(Character.isDigit('5'));
		System.out.println(Character.isLetter('5'));
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toString('1'));
		
		String str1="hello";
		char ch[]=str1.toCharArray();
		for(int i=0;i<ch.length;i++)
			System.out.println(ch[i]);

	}

}*/


/*package class1_program;

import java.util.Scanner;

public class Character_methods {

	public static void main(String[] args) {
		//String str1="hello123";
		Scanner s = new Scanner(System.in);
		String str1;
		str1=s.next();
		char ch[]=str1.toCharArray();
		int digits=0, Alphabets=0, Vowel=0, Consonent=0, special=0;
		for(int i=0;i<ch.length;i++)
		{
			System.out.print("\t" +ch[i]);
			if(Character.isDigit(ch[i]))
				digits++;
			else if(Character.isLetter(ch[i]))
				Alphabets++;
			else
				special++;
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'
					||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
				Vowel++;
			else
				Consonent++;
		}
		System.out.println("\ndigits: "+digits);
		System.out.println("Alphabets: "+Alphabets);
		System.out.println("special: "+special);
		System.out.println("Vowel: "+Vowel);
		System.out.println("Consonent: "+Consonent);
		//System.out.println("Alphabets: "+Character.isLetter('5'));
		//System.out.println("Digits: "+Character.isDigit('5'));
		s.close();
		
	}
}*/


// To find 1st position in character method:
package class1_program;

import java.util.Scanner;

public class Character_methods {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String str1;
	str1=s.nextLine();
	char ch[]=str1.toCharArray();
	int Vowel=0, Consonent=0, special=0, Whitespace=0, Small_letter=0, Capital_letter=0;
	for(int i=0;i<ch.length;i++)
	{
		if(Character.isLetter(ch[i])) 
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'
					||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			{
				if(Vowel==0)
					Vowel=i+1;
			}
				
			else if(Consonent==0)
				Consonent=i+1;
			if(Character.isUpperCase(ch[i])&& Capital_letter==0)
				Capital_letter=i+1;
			else if(Character.isLowerCase(ch[i])&& Small_letter==0)
				Small_letter=i+1;
		}
			else if(Character.isWhitespace(ch[i]) && Whitespace==0)
				Whitespace=i+1;
			else if(special==0)
				special=i+1;
		}
		
		
	
	System.out.println("Capital_letter: "+Capital_letter);
	System.out.println("Small_letter: "+Small_letter);
	System.out.println("Vowel: "+Vowel);
	System.out.println("Consonent: "+Consonent);
	System.out.println("Whitespace: "+Whitespace);
	System.out.println("special: "+special);
	s.close();
}
}
		
