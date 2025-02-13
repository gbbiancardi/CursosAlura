package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		// Fluxo de Entrada com Arquivo 02
		InputStream fis = new FileInputStream("mussum.txt"); // InputStream � a classe pai
		Reader isr = new InputStreamReader(fis, "UTF-8"); // Reader � a classe mais gen�rica, classe pai
		BufferedReader br = new BufferedReader(isr); // Transformando os Characteres em Linhas

		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}

		br.close();

//		// Fluxo de Entrada com Arquivo 01
//		FileInputStream fis = new FileInputStream("mussum.txt"); // C�digo bin�rio - Fluxo concreto
//		InputStreamReader isr = new InputStreamReader(fis); // Transformando o Bin�rio em Character
//		BufferedReader br = new BufferedReader(isr); // Transformando os Characteres em Linhas
//		
//		String linha = br.readLine();
//		
//		while (linha != null) {
//			System.out.println(linha);
//			linha = br.readLine();
//		}	
//		
//		br.close();
	}

}
