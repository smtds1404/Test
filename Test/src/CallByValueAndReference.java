

public class CallByValueAndReference {

	int i,j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByValueAndReference obj = new CallByValueAndReference();
		obj.i=100;
		obj.j=200;
		System.out.println(obj.testSum(obj.i, obj.j));
		obj.swap(obj);
		System.out.println(obj.i+" "+obj.j);
	
	}
	
	

	//call by reference
	void swap(CallByValueAndReference c){
		int temp =  c.i;
		c.i=c.j;
		c.j=temp;
		
	}
	
	//Call by Value
	public int testSum(int a, int b){
		return (a+b);
	}

}
