package CAP05;

import java.io.*;
public class C05EX14 {

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
		
		try{
			  QUOCIENTE = DIVIDENDO / DIVISOR;			
			
		System.out.print("O resultado equivale � " + QUOCIENTE);
		System.out.println();
		}
		catch (ArithmeticException ae){
			System.out.println();
			System.out.print("Erro de divis�o por zero. " );
			System.out.println();
			
		}
	}
}
