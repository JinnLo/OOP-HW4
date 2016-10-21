package fcu.iecs.oops.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		NissanTiida nissantiida = new NissanTiida();
		Scanner scanner = new Scanner(System.in);
		int number,i=0;
		int[][] square;
		
		System.out.println("Please key in a number:");
		number = scanner.nextInt();
		
		for(i=0;i<number;i++){
			for(int j=0;j<number;j++){
				square[i][j] = nissantiida.tiida(number);
			}
			
		}
		
		
		
		
	}
	
}
