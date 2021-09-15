package entidades;

public abstract class Embaralhador implements interfaces.Embaralhador{
	
	public String dividir(String palavra) {
		String str1 = palavra;
		String str2 = null;
		String str3 = null;
		int meio = str1.length() / 2;
		str2 = str1.substring(0, meio);
		str3 = str1.substring(meio, str1.length());
		str1 = str3.concat(str2);
		return str1;
	}
	
	public String regressao(String palavra) {
		 String n1 = palavra;
		 String[] n2 = n1.split("");
		 String[] n3 = n2.clone();
		 String strAlterada = "";
		 String aux = null;
		 int i = 0;
		 
	    while(i < n2.length) {
	    	if(i < (n2.length - 1)) {
	    		aux = n3[i+1];
	    		n2[i] = aux;
	    	}
	    	else if(i == n2.length - 1) {
	    		n2[i] = n3[0];
	    	}
	    	i++;
	    }
	    
	    while(i < n2.length) {
	    	if(i < (n2.length - 1)) {
	    		aux = n3[i];
	    		n2[i+1] = aux;
	    	}
	    	i++;
	    	
	    }
	    for(String s: n2) {
	    	strAlterada = strAlterada.concat(s);
	    }
		return strAlterada;
	}
}
