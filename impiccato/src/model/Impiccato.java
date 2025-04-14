package model;

public class Impiccato {
	private String parolaSegreta;
	private StringBuilder parolaAttuale;
	private int tentativiRimanenti;
	
	public Impiccato() {
		this.tentativiRimanenti = 6; // Numero di tentativi
	}
	
	public void setParolaSegreta(String parolaSegreta) {
		this.parolaSegreta = parolaSegreta.toUpperCase();
		this.parolaAttuale = new StringBuilder("_".repeat(parolaSegreta.length()));
	}
	
	public String getParolaAttuale() {
		return parolaAttuale.toString().toUpperCase();
	}
	
	public int getTentativiRimanenti() {
		return tentativiRimanenti;
	}
	
	public boolean verificaLettera(char lettera) {
		boolean letteraTrovata = false;
		
		for (int i = 0; i < parolaSegreta.length(); i++) {
			if (parolaSegreta.charAt(i) == lettera) {
				parolaAttuale.setCharAt(i, lettera);
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
