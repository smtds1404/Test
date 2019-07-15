
public class Super extends Superkeyword{
	int i=200;

	Super(){
		super.i=1001;
		System.out.println(super.i+this.i);
	}
	Super(int i){
		System.out.println("sumit");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Super();

	}

}
