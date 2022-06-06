package Chapter02__Basic_Java_Programming;

public class BitShiftOperator {

	public static void main(String[] args) {
		short a = (short)0x55ff;
		short b = 0x00ff;
		// 비트연산
		System.out.printf("%x\n", a & b);		// ff
		System.out.printf("%x\n", a | b);		// 55ff
		System.out.printf("%x\n", a ^ b);		// 5500
		System.out.printf("%x\n", ~a);			// 1010 1010 0000 0000
		
		byte c = 20;		// 1010
		byte d = -8;		// 1000
		// 시프트 연산
		System.out.println(c<<2);		// 80
		System.out.println(c>>2);
		System.out.println(d>>2);
		System.out.printf("%x\n",  d>>>2);
	}
}
