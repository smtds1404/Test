
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 153,input = number, temp=0,x=0;
		while (input >0){
			temp=input % 10;
			x=x+temp*temp*temp;
			input=input/10;
		}
		if(x==number){
			System.out.println("the number is an Armstrong Number");
		}else{System.out.println("the number is not an Armstrong Number");}
	}

}
