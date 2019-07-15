package oopsConceptPart2;

public class HdfcBank implements AmaricanBank{

	public void CustomerCare(){
		System.out.println("Customer Care HdfcBank");
	}
	public void InterestRate(){
		System.out.println("InterestRate HdfcBank");
	}
	
	void sum(){
		System.out.println("sum HdfcBank");
		
	}
	
	public static void main(String[] args){
		AmaricanBank a= new HdfcBank();
		a.CustomerCare();
		a.InterestRate();
		new HdfcBank().sum();
		
		
	}
	

	
}
