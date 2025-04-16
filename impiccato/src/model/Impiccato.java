package model;

import java.util.ArrayList;

public class Impiccato {
	private String parolaSegreta;
	private String parolaAttuale;
	private int tentativiRimanenti;
	
	public Impiccato() {
		this.tentativiRimanenti = 6; // Numero di tentativi
	}
	
	public void setParolaSegreta(String parolaSegreta) {
		this.parolaSegreta = parolaSegreta.toUpperCase();
		this.parolaAttuale = new String();
		for(int i=0;i<parolaSegreta.length();i++) {
			if(parolaSegreta.charAt(i)==' ') {
				this.parolaAttuale+=' ';
			}
			else {
				this.parolaAttuale+='_';
			}
		}
	}
	
	
	public String getParolaSegreta() {
		return parolaSegreta;
	}

	public String getParolaAttuale() {
		return parolaAttuale.toString().toUpperCase();
	}
	
	public int getTentativiRimanenti() {
		return tentativiRimanenti;
	}
	public boolean verificaParola(String parola) {
		boolean parolaTrovata = false;
		String[] parole = parola.split("\\s+");
		String[] paroleSegrete = parolaSegreta.split("\\s+");
		String[] paroleAttuali = parolaAttuale.split("\\s+");
		for(int i=0;i<parole.length;i++) {
			for(int j=0;j<paroleSegrete.length;j++) {
				if(parole[i].equals(paroleSegrete[j])) {
					paroleAttuali[j]=parole[i];
					parolaTrovata = true;
					break;
				}
			}
		}
		
		if (!parolaTrovata && tentativiRimanenti > 0) {
			tentativiRimanenti-=2;
			if(tentativiRimanenti<0) {
				tentativiRimanenti=0;
			}
		}
		return parolaTrovata;
		
	}
	public boolean verificaLettera(char lettera) {
		boolean letteraTrovata = false;
		
		for (int i = 0; i < parolaSegreta.length(); i++) {
			if (parolaSegreta.charAt(i) == lettera) {
				StringBuilder p = new StringBuilder(parolaAttuale);
				p.setCharAt(i, lettera);
				parolaAttuale = p.toString();
				letteraTrovata = true;
			}
		}
		
		if (!letteraTrovata && tentativiRimanenti > 0) {
			tentativiRimanenti--;
		}
		
		return letteraTrovata;
	}
	
	public boolean isGiocoFinito() {
		return tentativiRimanenti <= 0 || parolaAttuale.toString().equals(parolaSegreta);
	}
	
}
