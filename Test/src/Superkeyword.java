
public class Superkeyword{
	
	int i; 
	Superkeyword(){
		System.out.println("No argument");
	}

	Superkeyword(int i){
		System.out.println("Single Argument: " + i);
		this.i=100;
		System.out.println(this.i+i);
	}
	Superkeyword(int i,int j){
		System.out.println("Two Arguments: " + i+ " & "+ j);
	}
	Superkeyword(String i,int j){
		System.out.println("Two Arguments: " + i+ " & "+ j);
	}

	public static void main(String[] args) {
		
		new Superkeyword();
		new Superkeyword(10);
		new Superkeyword(10,20);
		new Superkeyword("sumit",100);
		System.out.println(new Superkeyword().i);
		
}

	

}