package br.com.mauricio.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Socket s = new Socket();

		// InputStream fis = s.getInputStream();
		// InputStream fis = new FileInputStream("lorem.txt");
		InputStream fis = System.in;
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		// OutputStream fos = s.getOutputStream();
		OutputStream fos = new FileOutputStream("lorem2.txt");
		// OutputStream fos = System.out;
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();

		while (linha != null && !linha.isEmpty()) {

			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}

		br.close();
		bw.close();

	}

}
