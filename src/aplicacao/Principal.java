package aplicacao;

import java.util.Scanner;

import entidades.FabricaMecanicasDoJogo;
import entidades.ModoMorteSubita;
import entidades.ModoPadrao;

public class Principal {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FabricaMecanicasDoJogo fb = new FabricaMecanicasDoJogo();
		String strResp = null;
		String strModo = null;
		ModoPadrao mecPadrao = null;
		ModoMorteSubita mecMorteSubita = null;
		
		System.out.println("Bem vindo ao Jogo das Palavras Embaralhadas.");
		System.out.print("Escolha um modo de Jogo (Padrao ou Morte Súbita): ");
		strModo = sc.nextLine();
		strModo = strModo.toLowerCase();
		System.out.println("Início");
		System.out.println("**************************************************************************");
		
		if(strModo.equals("padrao")) {
			mecPadrao = (ModoPadrao)fb.retornaMecanica(strModo);
			while(!mecPadrao.getTerminou()) {
				System.out.println(mecPadrao.iniciarJogada());
				System.out.println();
				System.out.print("Resposta: ");
				strResp = sc.next();
				System.out.println("**************************************************************************");
				sc.nextLine();
				mecPadrao.terminarJogada(strResp);
				}
			System.out.println(mecPadrao.pontuacao());
		
		}
		
		else if(strModo.equals("morte subita")) {
			mecMorteSubita = (ModoMorteSubita)fb.retornaMecanica(strModo);
			while(!mecMorteSubita.getTerminou()) {
				System.out.println(mecMorteSubita.iniciarJogada());
				System.out.print("Resposta: ");
				strResp = sc.next();
				System.out.println("**************************************************************************");
				mecMorteSubita.terminarJogada(strResp);
				}
			System.out.println(mecMorteSubita.pontuacao());
		}
		System.out.println("Fim de Jogo");
		sc.close();
		}
}
	

