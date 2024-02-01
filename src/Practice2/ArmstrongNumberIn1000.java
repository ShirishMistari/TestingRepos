package Practice2;

public class ArmstrongNumberIn1000 {
 
	int a=500;
	char charrr = 'A';
	static int b=1000;
	static char c = 'M';
	public static void main(String[] args) {
		ArmstrongNumberIn1000 bb = new ArmstrongNumberIn1000();
		PrintArmstrongNumberBetween1000();
		System.out.println("call By Reference");
		System.out.println(bb.a);
		System.out.println(bb.charrr);
		System.out.println("*********");
		bb.Test(bb);
		System.out.println(bb.a);
		System.out.println(bb.charrr);
		System.out.println("call By Value");
		System.out.println(b);
		System.out.println(c);
		System.out.println("******");
	    bb.Test1(1000,'Z');
	    System.out.println("*******");
	    System.out.println(b);
		System.out.println(c);
		
		System.out.println("Add This Line to modify by owner 2.....");
	    
		
		
	}
	public static void PrintArmstrongNumberBetween1000() {
		for(int n=0;n<=1000;n++) {
			int a; int i=0,j=0;
			a=n;             //a=n=153; 153 is greater than a
			while(a>0) {
				i = a%10;         //153%10 = 3 remaining & i value is 15
				j=j+(i*i*i);      //j=0+(15*15*15)
				a=a/10;           //a=153/10=15  27+125+1=153
			}
			if(n==j) {
				System.out.println(n);
			}
		}
	}
	
	public void Test(ArmstrongNumberIn1000 oo) { //Call by Reference...
		 int a = oo.a=100;
		char charrr =  oo.charrr = 'B';
	}
	public void Test1(int b, char c) {
		System.out.println(b);
		System.out.println(c);
	}
}
	
