package model;

public class Komentar {

	private String kupac;
	private SportskiObjekat objekat;
	private String komentar;
	private OcenaEnum ocena;
	
	public Komentar(String kupac, SportskiObjekat objekat, String komentar, OcenaEnum ocena) {
		super();
		this.kupac = kupac;
		this.objekat = objekat;
		this.komentar = komentar;
		this.ocena = ocena;
	}

	public String getKupac() {
		return kupac;
	}

	public void setKupac(String kupac) {
		this.kupac = kupac;
	}

	public SportskiObjekat getObjekat() {
		return objekat;
	}

	public void setObjekat(SportskiObjekat objekat) {
		this.objekat = objekat;
	}

	public String getKomentar() {
		return komentar;
	}

	public void setKomentar(String komentar) {
		this.komentar = komentar;
	}

	public OcenaEnum getOcena() {
		return ocena;
	}

	public void setOcena(OcenaEnum ocena) {
		this.ocena = ocena;
	}
	
}
