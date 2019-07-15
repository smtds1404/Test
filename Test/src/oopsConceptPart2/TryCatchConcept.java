package oopsConceptPart2;

public class TryCatchConcept {
	public void finalize(){
		System.out.println("Finalize");
	}
	
	final int i = 100;
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		try{
		System.out.println("Try Block");

		throw new ArrayIndexOutOfBoundsException(); 
		}catch (Exception  e){
			System.out.println("Catch Block");
		}
		finally{
			System.out.println("Finally Block");
		}
		TryCatchConcept t = new TryCatchConcept();
		t=null;
		
		
		System.gc();
		
	}
	
	

}
