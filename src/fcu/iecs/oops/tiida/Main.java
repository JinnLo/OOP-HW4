package fcu.iecs.oops.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		NissanTiida nissantiida = new NissanTiida();
		Scanner scanner = new Scanner(System.in);
		int number,i=0;
	
		
		System.out.println("Please key in a number:");
		number = scanner.nextInt();
		
		for(i=1;i<=number;i++)
	    nissantiida.tiida(i);
			
		}
		
		
		
		
	}
	
