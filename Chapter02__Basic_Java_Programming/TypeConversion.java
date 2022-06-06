package Chapter02__Basic_Java_Programming;

public class TypeConversion {

	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		
		java.lang.System.out.println(b+i);		// 127 + 100 227
		java.lang.System.out.println(10/4);		// 2
		java.lang.System.out.println(10.0/4);	// 2.5
		java.lang.System.out.println((char)0x12340041);
		java.lang.System.out.println((byte)(b+i));	// 오버플로우
		System.out.println((int)2.9 +1.8);			// 2 + 1.8 = 3.8
		System.out.println((int)(2.9 + 1.8));		//4
		System.out.println((int)2.9 + (int)1.8);	// 3
		

	}

}