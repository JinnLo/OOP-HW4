package fcu.iecs.oops.tiida;

public class NissanTiida {

	
	public void tiida(int number){
		
		int i=0;
	
		/*for(i=0;i<number;i++){
			for(int j=0;j<number;j++){
				System.out.println("*");
			}
		System.out.println(" ");
		}*/
		for (i = 0; i < number; i++) { 
			for (int j = 0; j < i; j++) { 
			System.out.print(""); 
			} 
			for (int j = 0; j < number; j++) { 
			System.out.print("*"); 
			} 
			System.out.println(); 
			} 
		
	}
}
