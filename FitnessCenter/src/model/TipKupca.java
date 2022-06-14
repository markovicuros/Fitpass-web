package model;

public class TipKupca {
	
	private String ime_tipa;
	private String popust;
	private int broj_bodova;

	
	public TipKupca(String ime_tipa, String popust, int broj_bodova) {
		super();
		this.ime_tipa = ime_tipa;
		this.popust = popust;
		this.broj_bodova = broj_bodova;
	}
	public String getIme_tipa() {
		return ime_tipa;
	}
	public void setIme_tipa(String ime_tipa) {
		this.ime_tipa = ime_tipa;
	}
	public String getPopust() {
		return popust;
	}
	public void setPopust(String popust) {
		this.popust = popust;
	}
	public int getBroj_bodova() {
		return broj_bodova;
	}
	public void setBroj_bodova(int broj_bodova) {
		this.broj_bodova = broj_bodova;
	}
	
	

}
