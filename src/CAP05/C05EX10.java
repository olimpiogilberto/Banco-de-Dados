package CAP05;

import java.io.*;
public class C05EX10 {

	public static void main(String[] args) {
		
		int MES;
		
	    System.out.println();
	    
		System.out.print("Entre o valor referente a um MES: ");
		try {
			BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
			MES = Integer.parseInt(br.readLine()); }  
			catch (Exception e) {
			MES = 0;
			}
		
		System.out.println();
		
		if(MES == 1)
			System.out.print("Janeiro");
		else
			if(MES == 2)
			System.out.print("Fevereiro");
			else	if(MES == 3)
			System.out.print("Março");
			else	if(MES == 4)
				System.out.print("Abril");
			else	if(MES == 5)
				System.out.print("Maio");
			else if(MES == 6)
				System.out.print("Junho");
			else		if(MES == 7)
				System.out.print("Julho");
			else	if(MES == 8)
				System.out.print("Agosto");
			else if(MES == 9)
				System.out.print("Setembro");
			else	if(MES == 10)
				System.out.print("Outubro");
			else if(MES == 11)
				System.out.print("Novembro");
			else	if(MES == 12)
					System.out.print("Dezembro");		
			else
		System.out.print("Mês inválido ");
	System.out.println();
	}
}
