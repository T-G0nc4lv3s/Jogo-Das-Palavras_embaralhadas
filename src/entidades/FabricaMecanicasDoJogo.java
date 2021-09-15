package entidades;

import java.util.ArrayList;
import java.util.List;

public class FabricaMecanicasDoJogo {
	
	private List<Object> lstMecanicas = new ArrayList<Object>();

	public FabricaMecanicasDoJogo() {
		this.lstMecanicas.add(new ModoPadrao());
		this.lstMecanicas.add(new ModoMorteSubita());
	}
	
	public Object retornaMecanica(String modo) {
		if(modo.toLowerCase().equals("padrao")) {
			ModoPadrao mdp = ((ModoPadrao) lstMecanicas.get(0));
			return mdp;
		}
		else if(modo.toLowerCase().equals("morte subita")) {
			ModoMorteSubita mdms = ((ModoMorteSubita) lstMecanicas.get(1));
			return mdms;
			}
		else {
			return null;
			}
		}
}
