package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import interfaces.Embaralhador;

public class FabricaEmbaralhadores {
	
	private List<Embaralhador> lista;

	public FabricaEmbaralhadores() {
		lista = new ArrayList<Embaralhador>();
		lista.add(new EmbaralhadorFacil());
		lista.add(new EmbaralhadorMedio());
		lista.add(new EmbaralhadorDificil());
	}
	
	public Embaralhador gerar() {
		int tam = lista.size();
		Random rdm = new Random();
		int index = rdm.nextInt(tam);
		Embaralhador obj = lista.get(index);
		return obj;
		
	}
}
