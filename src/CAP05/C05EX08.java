package CAP05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C05EX08 {

	public static void main(String[] args) {
		
		int A, B, C;
		
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
		
		System.out.print("Entre o valor <C>: ");
		try {
			BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
			C = Integer.parseInt(br.readLine()); }  
			catch (Exception e) {
				C = 0;
			}
		
		if(A<B+C && B<C+A && C<A+B)
			if(A==B && B==C)
				System.out.print("Triangulo Equilatero");
		    else
		    	if(A==B || A==C || C==B)
			   System.out.print("Triangulo Isosceles");
		        else
			   System.out.print("Triangulo Escaleno");
		else
		System.out.print("Os valores não formam um triangulo ");
	System.out.println();
	}
}
