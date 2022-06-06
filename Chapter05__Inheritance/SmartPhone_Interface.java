package Chapter05__Inheritance;
interface MP3 {
	public void play();
	public void stop();
}
interface MobilePhone extends MP3{
	public boolean sendCall();
	public abstract boolean receiveeCall();
	public abstract boolean sendSMS();
	public boolean receiveSMS();
}

class PDA {
	public int calculate(int x, int y) {
		return x + y;
	}
}


public class SmartPhone_Interface extends PDA implements MobilePhone{
	public void play(){
		System.out.println("���� ���");
	}
	public void stop() {
		System.out.println("��� ����");
	}
	@Override
	public boolean sendCall() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ �ɱ�");
		return true;
	}
	@Override
	public boolean receiveeCall() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ �ޱ�");
		return true;
	}
	@Override
	public boolean sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("SMS ������");
		return true;
	}
	@Override
	public boolean receiveSMS() {
		// TODO Auto-generated method stub
		System.out.println("SMS �ޱ�");
		return true;
	}
	
	// method additional
	public void scheduler(){
		System.out.println("���� ����");
		
	}
	public void application() {
		System.out.println("�������α׷� ��ġ/����");
	}
	public static void main(String[] args) {
		SmartPhone_Interface p = new SmartPhone_Interface();
		p.sendCall();
		p.play();
		System.out.println(p.calculate(3, 5));
		p.scheduler();
	}
	
}
