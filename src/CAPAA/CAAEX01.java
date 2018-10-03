package CAPAA;

import java.io.*;

class CAAEX01 {

  public static void main(String args[]) { 
  
    // O codigo ASCII imprimivel inicia-se com valor 32,
    // correspondente ao codigo de espaco em branco.

    for(int CODIGO = 01; CODIGO <= 256; CODIGO++) {
      System.out.print("--> " +  (char)CODIGO + " codigo");
      System.out.print(" ASCII = [" + CODIGO + "]");
      System.out.println();
    }
  }
}

