package Practice;

public class IndexPosition {
	public int test(String str){
        char charToFind = 'o';

        int index = str.indexOf(charToFind);

        if (index != -1) {
            System.out.println(+index);
        } else {
            System.out.println("Character not found");
        }
        return index;
	}
}

//Another method:

/*String[] pos = name.split(" ");
 * char[] cha = name.tocharArray();
 * int pos = Arrays.asList(cha).indexOf("kumar");
 * System.out.println();
 */
 
 /* for(int i=0;i<cha.length;i++)
  * {
  * if("o".toString().equls(""+cha[i])){
  * System.out.println(o);
  */
 