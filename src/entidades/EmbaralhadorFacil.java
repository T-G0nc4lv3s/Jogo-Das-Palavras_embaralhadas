package entidades;

import interfaces.Embaralhador;

public class EmbaralhadorFacil extends entidades.Embaralhador implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		String str = dividir(palavra);
		return str;
	}

}
