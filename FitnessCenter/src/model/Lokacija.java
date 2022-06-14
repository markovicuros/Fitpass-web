package model;

public class Lokacija {

	private String geografska_duzina;
	private String geografska_sirina;
	private Adresa adresa;
	
	public Lokacija(String geografska_duzina, String geografska_sirina, Adresa adresa) {
		super();
		this.geografska_duzina = geografska_duzina;
		this.geografska_sirina = geografska_sirina;
		this.adresa = adresa;
	}

	public String getGeografska_duzina() {
		return geografska_duzina;
	}

	public void setGeografska_duzina(String geografska_duzina) {
		this.geografska_duzina = geografska_duzina;
	}

	public String getGeografska_sirina() {
		return geografska_sirina;
	}

	public void setGeografska_sirina(String geografska_sirina) {
		this.geografska_sirina = geografska_sirina;
	}

	public Adresa getAdresa() {
		return adresa;
	}

	public void setAdresa(Adresa adresa) {
		this.adresa = adresa;
	}
	
	
	
	
}
