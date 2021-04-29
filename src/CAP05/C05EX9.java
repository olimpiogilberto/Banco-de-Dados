package CAP05;

import java.io.*;
public class C05EX9 {

	public static void main(String[] args) {
		
		float A, B, R = 0;
		int OPCAO;
		
	    System.out.println();
	    
		System.out.print("Entre o valor <A>: ");
		try {
			BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
			A = Integer.parseInt(br.readLine()); }  
			catch (Exception e) {
				A = 0;
			}
		
		System.out.print("Entre o valor <B>: ");
		try {
			BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
			B = Integer.parseInt(br.readLine()); }  
			catch (Exception e) {
				B = 0;
			}
		
		System.out.println();
		System.out.print("[1] - Adição");
		System.out.print("[2] - Subtração ");
		System.out.print("[3] - Multiplicação ");
		System.out.print("[4] - Divisão ");
		System.out.println();
		System.out.print("Escolha uma opção: ");
		try {
			BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
			OPCAO = Integer.parseInt(br.readLine()); }  
			catch (Exception e) {
			OPCAO = 0;
			}
		
		if(OPCAO == 1)
			R = A + B;
		if(OPCAO == 2)
		    R = A - B;
		if(OPCAO == 3)
			R = A * B;
		if(OPCAO == 4)
			if(B==0)
			  R = 0;
			else
			  R = A / B;			
			
		System.out.print("O resultado equivale à " + R);
	System.out.println();
	}
}
