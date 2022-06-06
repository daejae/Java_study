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
		System.out.println("음악 재생");
	}
	public void stop() {
		System.out.println("재생 중지");
	}
	@Override
	public boolean sendCall() {
		// TODO Auto-generated method stub
		System.out.println("전화 걸기");
		return true;
	}
	@Override
	public boolean receiveeCall() {
		// TODO Auto-generated method stub
		System.out.println("전화 받기");
		return true;
	}
	@Override
	public boolean sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("SMS 보내기");
		return true;
	}
	@Override
	public boolean receiveSMS() {
		// TODO Auto-generated method stub
		System.out.println("SMS 받기");
		return true;
	}
	
	// method additional
	public void scheduler(){
		System.out.println("일정 관리");
		
	}
	public void application() {
		System.out.println("응용프로그램 설치/삭제");
	}
	public static void main(String[] args) {
		SmartPhone_Interface p = new SmartPhone_Interface();
		p.sendCall();
		p.play();
		System.out.println(p.calculate(3, 5));
		p.scheduler();
	}
	
}
