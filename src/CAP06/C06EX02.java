package CAP06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C06EX02 {

	public static void main(String[] args) {
		
		int I, RESP;
		
		
	  
	    
		RESP = 1;
		while (RESP == 1) {
			System.out.println();
			I = 1;
			while (I <= 5)
			{
				System.out.println("Valor = " + I);
				I++;
			}
			
			System.out.println();
			System.out.println("Deseja continuar?");
			System.out.println("Tecle: [1] para SIM / [2] para NAO: ");
			
			try {
				BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
				RESP = Integer.parseInt(br.readLine()); }  
				catch (Exception e) {
				RESP = 0;
				}
		}
		
	}
}
