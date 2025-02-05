package introduction;

public class TypeCasting {
	
	public static void main(String[] args){
	
		byte b1 = 100;
		short s1 = b1; //implicit
		System.out.println(b1);
		System.out.println(s1);


	
		short s2 = 130;
		byte b2 = (byte)s2; //explicit
		System.out.println(s2);
		System.out.println(b2);
			


		char ch = 'a';
		int i1 = ch;
		System.out.println(ch);
		System.out.println(i1);
	}

}