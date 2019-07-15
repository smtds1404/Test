
class SelectionSort 
{ 

	public static void main(String args[]) 
	{ 
		
		int arr[] = {8,64,25,12,22,11,23,9}, j; 
		
		for(int i=0;i<arr.length;i++){
			for(j=arr.length-1;j>=i ;j--){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		/*for(int k: arr){
			System.out.print(k+" ");*/
		
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]+" ");
		}
		
		System.out.println("Largest no: "+ arr[(arr.length-1)] + "Smallest no: " + arr[0]);
		
	} 
} 
