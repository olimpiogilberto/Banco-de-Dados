package CAP05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C05EX2 {

	public static void main(String[] args) {
		
		int A, B, X;
		
		
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
        
		if( A > B){
		X = A;
		A = B;
		B = X;
		}
	    System.out.print("Valores ordenados são: " + A + " e " + B);
	    System.out.println();
	}
}
