import static org.junit.Assert.*;

import org.junit.Test;

import entidades.EmbaralhadorFacil;
import entidades.EmbaralhadorMedio;

public class TesteEmbaralhador {
	
	@Test
	public void testeDividir() {
		
		EmbaralhadorFacil embF = new EmbaralhadorFacil();
		String str = embF.dividir("borboleta");
		assertEquals("oletaborb", str);
	}
	
	@Test
	public void testeRegressao() {
		
		EmbaralhadorMedio embM = new EmbaralhadorMedio();
		String str = embM.regressao("macaco");
		assertEquals("acacom", str);
	}

}
