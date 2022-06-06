package Chapter03__LoopAndArrayAndException;

public class ArrayIndexOfOutBoundException {
	public static void main(String[] args){
		int[] p = new int[5];
		p[0] = 10;
		p[1] = 20;
		p[2] = 30;
		p[3] = 40;
		p[4] = 50;
		
		try{
			for(int i=0; i<=5;i++){
				System.out.print(p[i] + " ");
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("인덱스 범위 오류 발생");
			
		}
	}
}
