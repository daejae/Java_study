package Sol;

import java.util.ArrayList;
import java.util.Iterator;

public class p411_04 {
	public static void main(String[] args){
		ArrayList<Double> arrlist = new ArrayList<Double>();
		for(int i=0; i<100; i++){
			arrlist.add(Math.random()*100);
		}
		
		Iterator<Double> it = arrlist.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
