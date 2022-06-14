package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class IstorijaTreninga {

	private LocalDateTime vreme_prijave;
	private Trening trening;
	private String kupac;
	private String trener;
	
	public IstorijaTreninga(LocalDateTime vreme_prijave, Trening trening, String kupac, String trener) {
		super();
		this.vreme_prijave = vreme_prijave;
		this.trening = trening;
		this.kupac = kupac;
		this.trener = trener;
	}

	public LocalDateTime getVreme_prijave() {
		return vreme_prijave;
	}

	public void setVreme_prijave(LocalDateTime vreme_prijave) {
		this.vreme_prijave = vreme_prijave;
	}

	public Trening getTrening() {
		return trening;
	}

	public void setTrening(Trening trening) {
		this.trening = trening;
	}

	public String getKupac() {
		return kupac;
	}

	public void setKupac(String kupac) {
		this.kupac = kupac;
	}

	public String getTrener() {
		return trener;
	}

	public void setTrener(String trener) {
		this.trener = trener;
	}
	
	
}
