package listConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(58);
		ar.add(59);
		ar.add(56);
		ar.add(60);
		System.out.println("******for loop");
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
		}
		System.out.println("******iterator");
		Iterator<Integer> i= ar.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		System.out.println("******for each loop");
		for(int s: ar){
			System.out.println(s);
		}
		
	}

}
