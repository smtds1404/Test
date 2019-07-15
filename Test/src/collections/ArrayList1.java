package collections;
import java.util.ArrayList;
import java.util.Iterator;





public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("Sumit");
		
		
		ar.add("Mahesh");
		ar.add("Babu");
		ar.add(0,"Das");
		ar.remove(1);
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
			
		}
		Iterator<String> a= ar.iterator();
		while(a.hasNext()){
			System.out.println(a.next());
		}
		
}
}