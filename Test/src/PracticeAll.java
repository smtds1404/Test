
public class PracticeAll {
	int i, j;

	public void CallByValueOne(String s) {
		System.out.println("CallByValueOne: " + s);
	}

	public static void CallByValueTwo(String s) {
		System.out.println("CallByValueOne: " + s);
	}

	public void CallByRef(PracticeAll j) {
		int temp = j.i;
		j.i = j.j;
		j.j = temp;
	}
	public void CharOcc(String s){
		int count=0;String temp=new String();
		for(int i=0;i<s.length();i++){
			for(int j=i;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)){
					count++;				
					
				}
			}
			if(!temp.contains(String.valueOf(s.charAt(i)))){
			temp=temp+String.valueOf(s.charAt(i))+count;
			}count=0;
			
		}
		System.out.println(temp);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PracticeAll().CallByValueOne("Sumit");
		CallByValueTwo("Sumit2");
		PracticeAll a = new PracticeAll();
		a.i = 100;
		a.j = 50;
		System.out.println(a.i + " " + a.j);
		new PracticeAll().CallByRef(a);
		System.out.println(a.i + " " + a.j);
		
		
		
		String str = "DABAACBDDDDD";
		
		new PracticeAll().CharOcc(str);
		

	}

}
