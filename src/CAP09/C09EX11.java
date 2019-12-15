package CAP09;

import java.io.*;

public class C09EX11 {
	
public static void main(String args[]) {

	    TPai PAI = new TPai();
	    TFilho FILHO = new TFilho();

	    PAI.Executa();
	    FILHO.Executa();

	    PAI = FILHO;
	    PAI.Executa();

}
}
