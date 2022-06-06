package Sol;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Phone1 {
	private String name;
	private String addr;
	private String tel;

	public void setValue() {
		Scanner in = new Scanner(System.in);
		System.out.print("이름 : ");
		this.name = in.next();
		System.out.print("주소 : ");
		this.addr = in.next();
		System.out.print("전화번호 : ");
		this.tel = in.next();
	}

	public String getname() {
		return name;

	}

	public String getAddress() {
		return addr;
	}

	public String getTel() {
		return tel;
	}
}

public class p407_PhoneBookApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String, Phone1> map = new HashMap<String, Phone1>();
		showTitle();
		while (true) {
			int choice = printMenu();
			if (choice == 5)
				break;
			switch (choice) {
			case 1:
				addElement(map);
				break;
			case 2:
				deletePhone(map);
				break;
			case 3:
				findElement(map);
				break;
			case 4:
				printAll(map);
				break;
			}
		}
	}
	static void showTitle(){
		System.out.println("--------------------------------------------------------");
		System.out.println("전화번호 관리 프로그램을 실행합니다. 파일로 저장하지 않습니다.");
		System.out.println("--------------------------------------------------------");
	}
	
	static void addElement(HashMap<String, Phone1> map){
		Phone1 p = new Phone1();
		p.setValue();
		map.put(p.getname(), p);
	}
	static void findElement(HashMap<String, Phone1> map ){
		Scanner in = new Scanner(System.in);
		System.out.print("이름 : ");
		String key = in.next();
		Phone1 p= map.get(key);
		if(p == null)
			System.out.println("해당하는 주소록을 찾을 수 없습니다.");
		else
			System.out.println(p.getname() + " " + p.getAddress() + " " + p.getTel());
	}
	static int printMenu() {
		Scanner in = new Scanner(System.in);
		System.out.print("삽입:1, 삭제:2, 찾기:3  전체보기:4, 종료:5      \n선택 : ");
		int choice = in.nextInt();
		return choice;
	}

	static void printAll(HashMap<String, Phone1> map) {
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			Phone1 p = map.get(key);
			System.out.println(p.getname() + " " + p.getAddress() + " " + p.getTel());
		}
	}

	static void deletePhone(HashMap<String, Phone1> map) {
		Scanner in = new Scanner(System.in);
		System.out.print("이름 : ");
		String key = in.next();
		Phone1 p = map.remove(key);
		if(p!=null)
			System.out.println(p.getname() + " " + p.getAddress() + " " + p.getTel());
	}
}
