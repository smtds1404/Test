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
		
		
		int arr[]={10,20,50,30,40};

		int min;
		for(i=0;i<arr.length;i++){

		for(int j=i;j<arr.length-1;j++)
		if(arr[j]>arr[j+1])
			{
			min=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=min;

		}
		}
		for(i=0;i<arr.length;i++){
		System.out.println(arr[i]);
		}
	}

}
 