package entidades;

import interfaces.Embaralhador;

public class EmbaralhadorDificil extends entidades.Embaralhador implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		String strAlterada = regressao(palavra);
		strAlterada = dividir(strAlterada);
		return strAlterada;
	}

}
