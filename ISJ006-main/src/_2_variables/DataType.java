package _2_variables;

public class DataType {

	public static void main(String[] args){
		byte byteValue = 127;
		System.out.println("Byte Value stored is : "+byteValue);

		short shortValue = 32767;
		System.out.println("Short Value stored is : "+shortValue);

		int intValue = 50000;
		System.out.println("Int Value stored is : "+intValue);
		System.out.println("Integer Min value : "+Integer.MIN_VALUE);

		System.out.println("Long Min value : "+Long.MIN_VALUE);

		System.out.println("Float Min value : "+(Float.MAX_VALUE-1));

		System.out.println("Double Min value : "+(Double.MAX_VALUE-1));


	}
}