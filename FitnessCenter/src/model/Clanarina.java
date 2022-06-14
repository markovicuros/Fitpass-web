package model;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Clanarina {

	private int id;
	private String tip;
	private LocalDate datum;
	private LocalDateTime vremeVazenja;
	private String cena;
	private String kupac;
	private StatusAktEnum status;
	private String broj_termina;
	
	public Clanarina(int id, String tip, LocalDate datum, LocalDateTime vremeVazenja, String cena, String kupac,
			StatusAktEnum status, String broj_termina) {
		super();
		this.id = id;
		this.tip = tip;
		this.datum = datum;
		this.vremeVazenja = vremeVazenja;
		this.cena = cena;
		this.kupac = kupac;
		this.status = status;
		this.broj_termina = broj_termina;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public LocalDate getDatum() {
		return datum;
	}

	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}

	public LocalDateTime getVremeVazenja() {
		return vremeVazenja;
	}

	public void setVremeVazenja(LocalDateTime vremeVazenja) {
		this.vremeVazenja = vremeVazenja;
	}

	public String getCena() {
		return cena;
	}

	public void setCena(String cena) {
		this.cena = cena;
	}

	public String getKupac() {
		return kupac;
	}

	public void setKupac(String kupac) {
		this.kupac = kupac;
	}

	public StatusAktEnum getStatus() {
		return status;
	}

	public void setStatus(StatusAktEnum status) {
		this.status = status;
	}

	public String getBroj_termina() {
		return broj_termina;
	}

	public void setBroj_termina(String broj_termina) {
		this.broj_termina = broj_termina;
	}
	
	
}
