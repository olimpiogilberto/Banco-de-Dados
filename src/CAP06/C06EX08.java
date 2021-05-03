package CAP06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C06EX08 {

	public static void main(String[] args) {
		
		int N, I = 1;
		long FAT = 1;
	  
		System.out.println();
		System.out.println("Programa Fatorial \n");
		System.out.println("\n\nFatorial de qual valor: ");
		
		try {
			BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
			N = Integer.parseInt(br.readLine()); }  
			catch (Exception e) {
			N = 0;
			}
		while (I <= N){
			FAT *= I;
			I++;
		}
		
		System.out.println();
		System.out.println("Fatorial de " + N + " é " + FAT);
	}
}
