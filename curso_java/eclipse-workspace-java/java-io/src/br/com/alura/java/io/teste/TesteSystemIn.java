package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteSystemIn {

	public static void main(String[] args) throws IOException {

		Socket s = new Socket ();
		
		// Entrada
		InputStream fis = s.getInputStream(); // System.in; // new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		// Saída
		OutputStream fos = s.getOutputStream(); // System.out; // new FileOutputStream("mussum2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();

		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush(); // faz aparecer a resposta quando da o Enter
			linha = br.readLine();
		}

		br.close();
		bw.close();
	}

}
