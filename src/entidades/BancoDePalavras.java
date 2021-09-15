package entidades;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BancoDePalavras {
	
	private List<String> listaPalavras = null;
	private File arquivo = null;
	
	
	public BancoDePalavras() {
		Scanner sc = null;
		this.listaPalavras = new ArrayList<String>();
		this.arquivo = new File("C:\\Temp\\ws-eclipse\\ITA_Jogo_Palavras_Embaralhadas\\Arquivos\\RepositorioPalavras");
		try {
			sc = new Scanner(arquivo);
			while(sc.hasNextLine()) {
				listaPalavras.add(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Erro! " + e.getMessage());
		} 
		
		finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
	
	public String strAleatoria() {
		
		int limite = listaPalavras.size();
		String palavra;
		Random r = new Random();
		if(limite > 0) {
			int ind = r.nextInt(limite);
			palavra = listaPalavras.get(ind);
			listaPalavras.remove(ind);
		}
		else {
			palavra = null;
		}
		return palavra;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(String s : listaPalavras) {
			sb.append(s + "\n");
		}
		return sb.toString();
	}
	
	
}
