package CAP05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C05EX6 {

	public static void main(String[] args) {
		
		String NOME1, NOME2;
		int SEXO1, SEXO2, I;
		
	    System.out.println();
	    
		System.out.print("Entre o primeiro nome .....: ");
		try {
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		NOME1 = br.readLine(); }  
		catch (Exception e) {
			NOME1 = "";
		}
		
		System.out.print("Entre com o sexo: M --> [1] // F -- [2]  .....: ");
		try {
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		SEXO1 = Integer.parseInt(br.readLine()); }  
		catch (Exception e) {
			SEXO1 = 0;
		}
		
		System.out.print("Entre o segundo nome .....: ");
		try {
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		NOME2 = br.readLine(); }  
		catch (Exception e) {
			NOME2 = "";
		}
		
		System.out.print("Entre com o sexo: M --> [1] // F -- [2]  .....: ");
		try {
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		SEXO2 = Integer.parseInt(br.readLine()); }  
		catch (Exception e) {
			SEXO2 = 0;
		}
		   //esse símbolo ^ inverte o resultado lógico
		if( SEXO1 == 1 ^ SEXO2 == 2)
		{
			System.out.print(NOME1 + " pode se casar com " + NOME2);
			
		}
		else
			System.out.print(NOME1 + " não pode se casar com " + NOME2);
	}
}
