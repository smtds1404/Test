package collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;


public class HashTableConcept {

	public static void main(String[] args) {
		Hashtable<String, String> h = new Hashtable<String, String>();
		h.put("a", "Sumit");
		h.put("b", "Das");
		h.put("c", "End");
		for (Entry<String, String> st : h.entrySet()) {

			System.out.println(st);
		}
		for (String s : h.keySet()) {
			System.out.println(h.get(s));
		}
		Iterator<String> i = h.keySet().iterator();
		while (i.hasNext()) {
			System.out.println(h.get(i.next()));

		}
		Iterator<Entry<String, String>> j = h.entrySet().iterator();
		while (j.hasNext()) {
			System.out.println(j.next());
		}
		System.out.println(h);
	}

}
