package CAP04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C04EX2 {

	public static void main(String[] args) {
		float HT, VH, PD, TD, SB, SL;
		
	    System.out.println();
	    
		System.out.print("Entre com a quantidade de horas trabalhadas .....: ");
		try {
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		HT = Float.parseFloat(br.readLine()); } 
		catch (Exception e) {
		HT = 0;
		}
		   
		System.out.print("Entre com o valor da hora de trabalho.: ");
		try {
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		VH = Float.parseFloat(br.readLine()); } 
		catch (Exception e) {
		VH = 0;
		}

		System.out.print("Entre com o valor do percentual de desconto.: ");
		try {
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		PD = Float.parseFloat(br.readLine()); } 
		catch (Exception e) {
		PD = 0;
		}

		SB = HT * VH;
		TD = (PD / 100) * SB;
		SL = SB - TD;
		
	    System.out.println();
	    System.out.print("\nSalário Bruto......: " + SB);
	    System.out.print("\nDesconto...........: " + TD);
	    System.out.print("\nSalário Líquido ...: " + SL);
	    System.out.println();
	
	}
}
