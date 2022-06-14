package model;

import java.time.LocalTime;

public class Trening {

	private String naziv;
	private String tip;
	private SportskiObjekat objekat;
	private LocalTime trajanje;
	private String trener;
	private String opis;
	private byte[] slika;
	
	public Trening(String naziv, String tip, SportskiObjekat objekat, LocalTime trajanje, String trener, String opis,
			byte[] slika) {
		super();
		this.naziv = naziv;
		this.tip = tip;
		this.objekat = objekat;
		this.trajanje = trajanje;
		this.trener = trener;
		this.opis = opis;
		this.slika = slika;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public SportskiObjekat getObjekat() {
		return objekat;
	}

	public void setObjekat(SportskiObjekat objekat) {
		this.objekat = objekat;
	}

	public LocalTime getTrajanje() {
		return trajanje;
	}

	public void setTrajanje(LocalTime trajanje) {
		this.trajanje = trajanje;
	}

	public String getTrener() {
		return trener;
	}

	public void setTrener(String trener) {
		this.trener = trener;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public byte[] getSlika() {
		return slika;
	}

	public void setSlika(byte[] slika) {
		this.slika = slika;
	}
	
	
	
}
