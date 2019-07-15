package stringMethods;

public class DuplicateElimentsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0, i = 0;
		String temp = new String();
		String s[]={ "java", "python", "Selenium", "C", "Selenium", "Selenium", "Selenium", "Selenium", "C", "C" };
		for(int j=0;j<s.length;j++){
			for(int k=j+1;k<s.length;k++){
				if(s[j].equals(s[k])){
					count++;
					i++;	
					
				}												
			}if(!temp.contains(s[j])){
			if(count>0){
				System.out.println(s[j]+" is repeted "+(count+1)+" times");
				temp=temp+s[j];
			}}
			count=0;
		}
		if(i==0){
			System.out.println("No Duplicate found");
		}
		

	}

}
 