package entidades;

import interfaces.Embaralhador;

public class EmbaralhadorMedio extends entidades.Embaralhador implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		String str = regressao(palavra);
		return str;
	}

}
