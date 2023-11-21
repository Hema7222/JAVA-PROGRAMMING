package Practice;

public class DuplicateChar {
	public int Duplicate(String str) {
		char[] characters = str.toCharArray();
		for(int i=0;i<characters.length;i++) {
			char currentchar = characters[i];
			if(currentchar!='\0')
			{
				for(int j=i+1;j<characters.length;j++) {
					if(currentchar==characters[j]) {
						System.out.println("Duplicate Character: "+currentchar);
						characters[j] = '\0';
					}
				}
			}
			
		}
		return 0;
	}
}
