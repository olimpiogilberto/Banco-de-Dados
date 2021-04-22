package CAP04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C04EX01 {

	public static void main(String[] args) {
		String NOME;
		int IDADE;
		float ALTURA;
		
	    System.out.println();
	    
		System.out.print("Entre com seu nome .....: ");
		try {
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		NOME = br.readLine(); } 
		catch (Exception e) {
		NOME = "";
		}
		   
		System.out.print("Entre com sua idade.: ");
		try {
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		IDADE = Integer.parseInt(br.readLine()); } 
		catch (Exception e) {
		IDADE = 0;
		}

		System.out.print("Entre com sua Altura.: ");
		try {
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		ALTURA = Float.parseFloat(br.readLine()); } 
		catch (Exception e) {
		ALTURA = 0;
		}

	    System.out.println();
	    System.out.print("Meu nome é " + NOME);
	    System.out.print(", tenho " + IDADE + " anos de idade");
	    System.out.print(" e " + ALTURA + " de altura.");
	    System.out.println();
	
	}
}
