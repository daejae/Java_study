package Chapter07__Collection_and_Generics;

public class GenericTest<T> {
	T val;
	void set(T t) {GenericTest <String> object1 = new GenericTest<String>();
		object1.set("Hello World String");
		System.out.println(object1.get());
		
		GenericTest<Integer> object2 = new GenericTest<Integer>();
		object2.set(1004);
		System.out.println(object2.get());
	}
	T get(){
		return val;
	}

}
