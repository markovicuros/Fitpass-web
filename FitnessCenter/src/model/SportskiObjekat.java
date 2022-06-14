package model;

public class SportskiObjekat {

	private String naziv;
	private String tip;
	private String sadrzaj;
	private StatusEnum status;
	private Lokacija lokacija;
	private byte[] logo;
	private double prosecna_ocena;
	private String radno_vreme;
	
	public SportskiObjekat(String naziv, String tip, String sadrzaj, StatusEnum status, Lokacija lokacija, byte[] logo,
			double prosecna_ocena, String radno_vreme) {
		super();
		this.naziv = naziv;
		this.tip = tip;
		this.sadrzaj = sadrzaj;
		this.status = status;
		this.lokacija = lokacija;
		this.logo = logo;
		this.prosecna_ocena = prosecna_ocena;
		this.radno_vreme = radno_vreme;
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

	public String getSadrzaj() {
		return sadrzaj;
	}

	public void setSadrzaj(String sadrzaj) {
		this.sadrzaj = sadrzaj;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public Lokacija getLokacija() {
		return lokacija;
	}

	public void setLokacija(Lokacija lokacija) {
		this.lokacija = lokacija;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public double getProsecna_ocena() {
		return prosecna_ocena;
	}

	public void setProsecna_ocena(double prosecna_ocena) {
		this.prosecna_ocena = prosecna_ocena;
	}

	public String getRadno_vreme() {
		return radno_vreme;
	}

	public void setRadno_vreme(String radno_vreme) {
		this.radno_vreme = radno_vreme;
	}
	
	
	
}
