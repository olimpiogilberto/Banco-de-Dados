package CAP05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C05EX6 {

	public static void main(String[] args) {
		
		int CODIGO;
		
		
	    System.out.println();
	    
		System.out.print("Entre o código de acesso .....: ");
		try {
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		CODIGO = Integer.parseInt(br.readLine()); }  
		catch (Exception e) {
		CODIGO = 0;
		}
		   
		if( CODIGO == 1 || CODIGO == 2 || CODIGO == 3)
		{
			if(CODIGO == 1)
				System.out.print("um");
			if(CODIGO == 2)
				System.out.print("dois");
			if(CODIGO == 3)
				System.out.print("tres");
			
		}
		else
			System.out.print("Código inválido .....: ");
	}
}
