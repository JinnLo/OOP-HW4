package fcu.iecs.oops.password;

import java.util.Scanner;

public class Main {
    
	public static void main(String[] args){
		
		PasswordEncorder password = new PasswordEncorder();
		Scanner scanner = new Scanner(System.in);
		String Keyword;
		String Exit = "exit";
		
		int flag = 1;
		
		do{
		System.out.println("Please enter a password:");
		Keyword = scanner.next();
		
		if(Keyword.compareTo(Exit)==0){
			flag = 0;
			System.out.println("End");
		}
		else
			Keyword = password.encorder(Keyword);
		    System.out.printf("%s\n",Keyword);
		    flag = 1;
		}while(flag != 1);
	}


}
