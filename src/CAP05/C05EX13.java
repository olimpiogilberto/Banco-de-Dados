package CAP05;

import java.io.*;
public class C05EX13 {

	public static void main(String[] args) {
		
		int DIVIDENDO, DIVISOR, QUOCIENTE;
		
	    System.out.println();
	    
		System.out.print("Entre o valor do dividendo: ");
		try {
			BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
			DIVIDENDO = Integer.parseInt(br.readLine()); }  
			catch (Exception e) {
			DIVIDENDO = 0;
			}
		
		System.out.print("Entre o valor do divisor: ");
		try {
			BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
			DIVISOR = Integer.parseInt(br.readLine()); }  
			catch (Exception e) {
			DIVISOR = 0;
			}

			  QUOCIENTE = DIVIDENDO / DIVISOR;			
			
		System.out.print("O resultado equivale à " + QUOCIENTE);
	System.out.println();
	}
}
