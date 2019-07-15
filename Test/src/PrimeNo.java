
public class PrimeNo {
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0, i = 0; 
		for (int j = 3; j < 53; j++) {
			for (int k = j / 2; k > 1; k--) {
				if (j % k == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.print(j + ",");
				i++;
			}
			count = 0;
			if (i % 3 == 0 && i != 0) {
				System.out.println();
				i = 0;
			}
		}
		
		
		   
		
	}
	
	
	

}
