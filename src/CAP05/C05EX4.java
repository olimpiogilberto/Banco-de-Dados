package CAP05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C05EX4 {

	public static void main(String[] args) {
		
		int NUMERO;
		
		
	    System.out.println();
	    
		System.out.print("Entre um valor .....: ");
		try {
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		NUMERO = Integer.parseInt(br.readLine()); }  
		catch (Exception e) {
		NUMERO = 0;
		}
		   
		if( NUMERO >= 20 && NUMERO <= 90)
			System.out.print("O valor está entre 20 e 90.");
			else
	    System.out.print("O valor não está entre 20 e 90");
	    System.out.println();
	}
}
