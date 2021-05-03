package CAP05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C05EX03 {

	public static void main(String[] args) {
		
		int A, B, R;
		
		
	    System.out.println();
	    
		System.out.print("Entre com o valor <A> .....: ");
		try {
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		A = Integer.parseInt(br.readLine()); }  
		catch (Exception e) {
		A = 0;
		}
		   
		System.out.print("Entre com o valor <B> .....: ");
		try {
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		B = Integer.parseInt(br.readLine()); }  
		catch (Exception e) {
		B = 0;
		}
        
		R = A + B;
		System.out.println();
		if( R > 10)
			System.out.print("Resultado igual à " + R + ", ultrapassa o valor de dez.");
			else
	    System.out.print("Resultado igual à " + R + ", não ultrapassa o valor de dez. ");
	    System.out.println();
	}
}
