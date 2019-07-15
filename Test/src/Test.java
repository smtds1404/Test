
public class Test {
	
	
	public static void main(String[] args) {
	
		String s= "sumit";
		for(int i=0,j=s.length()-1;i<s.length()/2 ;i++,j--){
			char a;
			a=s.charAt(i);
			s=s.replace(s.charAt(i), s.charAt(j));
			System.out.println(i+" "+j+" "+a);
			System.out.println(s);
			s=s.replace(s.charAt(j), a);
			System.out.println(i+" "+j+" "+a);
			System.out.println(s);
		}
		System.out.println(s);
		
		
	}

}

