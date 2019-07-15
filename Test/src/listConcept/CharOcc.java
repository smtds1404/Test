package listConcept;

public class CharOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ZAAJJKKDDDBABD";
		int count=0;
		String temp= new String();
		for(int i=0;i<s.length();i++){
			for(int j =i;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)){
					count++;
				}
			}if(!temp.contains(String.valueOf(s.charAt(i)))){
			if(count>0){
				System.out.print(s.charAt(i)+""+count);
				temp=temp+s.charAt(i);
			}
			}
			count=0;
		}
		
	}

}
