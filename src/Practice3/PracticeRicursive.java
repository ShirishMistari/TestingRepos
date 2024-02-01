package Practice3;

public class PracticeRicursive {

	static String str="I love You";
	public static void main( String args []) {
		try {
			System.out.println(Ricursive(str));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String Ricursive(String str) {
		if(str==null || str.length()<=0) {
			return str;
		}
		return Ricursive(str.substring(1))+str.charAt(0);
		
	}
}
