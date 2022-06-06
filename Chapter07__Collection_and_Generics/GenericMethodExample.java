package Chapter07__Collection_and_Generics;

public class GenericMethodExample {
	public static <T>GStack<T> reverse(GStack<T> a){	// T�� Ÿ�� �Ű� ������ ���׸� �޼ҵ�
		GStack<T> s = new GStack<T>();	// ���� a�� �ݴ�� ������ ���� GStack ����
		while(true){
			T temp;
			temp = a.pop();	// ���� ���ÿ��� ��� �ϳ��� ����
			if(temp==null)	// ������ �����
				break;	// �Ųٷ� ����� �۾� ����
			else
				s.push(temp);
		}
		return s;
	}
	public static void main(String[] args) {
		GStack<Double> gs = new GStack<Double>();	// Double Ÿ���� GStack ����
		
		for(int i=0;i<5;i++)	// 5���� ��� push
			gs.push((double)i);
		
		gs = reverse(gs);	// ���׸� �޼ҵ� ȣ��
		
		for(int i=0; i< 5 ; i++)
			System.out.println(gs.pop());
		
	}
}
