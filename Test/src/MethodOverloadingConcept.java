
public class MethodOverloadingConcept {
	String s = "selenium";
	static int i=9;
	
	public static void main(String[] args) {
		MethodOverloadingConcept obj = new MethodOverloadingConcept();
		titan();
		obj.titan(10, 20, 30);
		obj.titan(obj.s);
	System.out.println(i);	
		titan(); 
		MethodOverloadingConcept.titan();
		int i=10;
		System.out.println(i);
		
		
	}

	public static void titan() {
		System.out.println("No Arguments method");
	}

	public void titan(String s) {
		System.out.println(s);

	}

	public void titan(int i, int y, int z) {
		System.out.println( this.i + y + z );

	}

}
