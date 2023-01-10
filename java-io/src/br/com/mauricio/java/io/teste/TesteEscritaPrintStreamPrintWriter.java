package br.com.mauricio.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem3.txt");
//		PrintStream ps = new PrintStream(new File("lorem3.txt"));
		PrintWriter ps = new PrintWriter("lorem3.txt");
		
		ps.println("Teste print stream linha 1");
		ps.println();
		ps.println("Teste print stream linha 2");

		ps.close();

	}

}
