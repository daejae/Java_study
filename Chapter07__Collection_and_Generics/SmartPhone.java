package Chapter07__Collection_and_Generics;

interface MobilePhone {
	public boolean sendCall();
	public boolean receiveCall();
	public boolean sendSMS();
	public boolean receiveSMS();
}

interface MP3 {
	public void play();
	public void stop();
}

class PDA {
	public int calculate(int x, int y) {
		return x + y;
	}
}

public class SmartPhone extends PDA implements MobilePhone, MP3{
	// MobliePhone�� ��� �߻� �޼ҵ� ����
	public boolean sendCall() {
		System.out.println("��ȭ �ɱ�");
		return true;
	}
	
	public boolean receiveCall() {
		System.out.println("��ȭ �ޱ�");
		return true;
	}
	public boolean sendSMS() {
		System.out.println("SMS ������");
		return true;
	}
	public boolean receiveSMS() {
		System.out.println("SMS �ޱ�");
		return true;
	}
	
	public void play() {
		System.out.println("���� ���");
	}
	
	public void stop() {
		System.out.println("��� ����");
	}
	
	// �޼ҵ� �߰� ����
	public void scheduler() {
		System.out.println("���� ����");
	}
	
	public void appliocationManager() {
		System.out.println("���� ���α׷� ��ġ/����");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone p = new SmartPhone();
		p.sendCall();
		p.play();
		System.out.println(p.calculate(3, 5));
		p.scheduler();		
	}

}
