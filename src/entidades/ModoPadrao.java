package entidades;

import interfaces.MecanicaDoJogo;

public class ModoPadrao implements MecanicaDoJogo {
	
	private int pontos = 0;
	private int vidas = 3;
	private int acertos = 0;
	private int rodadas = 0;
	private Boolean terminou = false;
	private BancoDePalavras banco;
	private FabricaEmbaralhadores fab;
	private Embaralhador emb;
	private String str;
	private String strResposta;
	
	public ModoPadrao() {
		banco = new BancoDePalavras();
		fab = new FabricaEmbaralhadores();
		emb = (entidades.Embaralhador) fab.gerar();
	}
	
	@Override
	public String iniciarJogada() {
		str = banco.strAleatoria();
		String strAlt = emb.embaralhar(str);
		return strAlt;
	}
	
	@Override
	public void terminarJogada(String resposta) {
		this.strResposta = resposta.toUpperCase();
		if(str.equals(strResposta)) {
			acertos += 1;
		}
		else {
			vidas -= 1;
			if(vidas == 0) {
				terminou = true;
			}
		}
		rodadas++;
		if(rodadas == 5) {
			terminou = true;
		}
	}

	@Override
	public String pontuacao() {
		pontos += acertos * 100;
		int pt = pontos;
		StringBuilder sb = new StringBuilder();
		if(pt > 0) {
			sb.append(String.format("Parabéns! \n Você fez %d pontos !!!", pt));
		}
		else {
			sb.append(String.format("Não foi desta vez! \nVocê fez %d pontos !!! \nTente novamente.", pt));
		}
		return sb.toString();
	}

	public int getRodadas() {
		int rdds = rodadas;
		return rdds;
	}

	public Boolean getTerminou() {
		Boolean fim = terminou;
		return fim;
	}
	
	
}
