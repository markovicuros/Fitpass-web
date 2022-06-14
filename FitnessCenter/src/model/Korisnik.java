package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Korisnik {

	private String korisnicko_ime;
	private String lozinka;
	private String ime;
	private String prezime;
	private PolEnum pol;
	private LocalDate datumRodjenja; 
	private Uloga uloga;
	private IstorijaTreninga istorija_treninga;
	private String clanarina;
	private SportskiObjekat sportski_objekat;
	private SportskiObjekat poseceni_objekat;
	private int broj_bodova;
	private TipKupca tip_kupca;	
	
	//Konstruktor za TRENERA
	public Korisnik(String korisnicko_ime, String lozinka, String ime, String prezime, PolEnum pol,
			LocalDate datumRodjenja, Uloga uloga, IstorijaTreninga istorija_treninga, TipKupca tip_kupca) {
		super();
		this.korisnicko_ime = korisnicko_ime;
		this.lozinka = lozinka;
		this.ime = ime;
		this.prezime = prezime;
		this.pol = pol;
		this.datumRodjenja = datumRodjenja;
		this.uloga = uloga;
		this.istorija_treninga = istorija_treninga;
		this.tip_kupca = tip_kupca;
	}

	
	//Konstruktor za KUPCA
	public Korisnik(String korisnicko_ime, String lozinka, String ime, String prezime, PolEnum pol,
			LocalDate datumRodjenja, Uloga uloga, String clanarina, SportskiObjekat poseceni_objekat, int broj_bodova,
			TipKupca tip_kupca) {
		super();
		this.korisnicko_ime = korisnicko_ime;
		this.lozinka = lozinka;
		this.ime = ime;
		this.prezime = prezime;
		this.pol = pol;
		this.datumRodjenja = datumRodjenja;
		this.uloga = uloga;
		this.clanarina = clanarina;
		this.poseceni_objekat = poseceni_objekat;
		this.broj_bodova = broj_bodova;
		this.tip_kupca = tip_kupca;
	}

	
	//Konstruktor za MENADZERA
	public Korisnik(String korisnicko_ime, String lozinka, String ime, String prezime, PolEnum pol,
			LocalDate datumRodjenja, Uloga uloga, SportskiObjekat sportski_objekat, TipKupca tip_kupca) {
		super();
		this.korisnicko_ime = korisnicko_ime;
		this.lozinka = lozinka;
		this.ime = ime;
		this.prezime = prezime;
		this.pol = pol;
		this.datumRodjenja = datumRodjenja;
		this.uloga = uloga;
		this.sportski_objekat = sportski_objekat;
		this.tip_kupca = tip_kupca;
	}

	//Za sva polja
	public Korisnik(String korisnicko_ime, String lozinka, String ime, String prezime, PolEnum pol,
			LocalDate datumRodjenja, Uloga uloga, IstorijaTreninga istorija_treninga, String clanarina,
			SportskiObjekat sportski_objekat, SportskiObjekat poseceni_objekat, int broj_bodova, TipKupca tip_kupca) {
		super();
		this.korisnicko_ime = korisnicko_ime;
		this.lozinka = lozinka;
		this.ime = ime;
		this.prezime = prezime;
		this.pol = pol;
		this.datumRodjenja = datumRodjenja;
		this.uloga = uloga;
		this.istorija_treninga = istorija_treninga;
		this.clanarina = clanarina;
		this.sportski_objekat = sportski_objekat;
		this.poseceni_objekat = poseceni_objekat;
		this.broj_bodova = broj_bodova;
		this.tip_kupca = tip_kupca;
	}
	
	
	public String getKorisnicko_ime() {
		return korisnicko_ime;
	}
	public void setKorisnicko_ime(String korisnicko_ime) {
		this.korisnicko_ime = korisnicko_ime;
	}
	public String getLozinka() {
		return lozinka;
	}
	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public PolEnum getPol() {
		return pol;
	}
	public void setPol(PolEnum pol) {
		this.pol = pol;
	}
	public LocalDate getDatumRodjenja() {
		return datumRodjenja;
	}
	public void setDatumRodjenja(LocalDate datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}
	public Uloga getUloga() {
		return uloga;
	}
	public void setUloga(Uloga uloga) {
		this.uloga = uloga;
	}
	public IstorijaTreninga getIstorija_treninga() {
		return istorija_treninga;
	}
	public void setIstorija_treninga(IstorijaTreninga istorija_treninga) {
		this.istorija_treninga = istorija_treninga;
	}
	public String getClanarina() {
		return clanarina;
	}
	public void setClanarina(String clanarina) {
		this.clanarina = clanarina;
	}
	public SportskiObjekat getSportski_objekat() {
		return sportski_objekat;
	}
	public void setSportski_objekat(SportskiObjekat sportski_objekat) {
		this.sportski_objekat = sportski_objekat;
	}
	public SportskiObjekat getPoseceni_objekat() {
		return poseceni_objekat;
	}
	public void setPoseceni_objekat(SportskiObjekat poseceni_objekat) {
		this.poseceni_objekat = poseceni_objekat;
	}
	public int getBroj_bodova() {
		return broj_bodova;
	}
	public void setBroj_bodova(int broj_bodova) {
		this.broj_bodova = broj_bodova;
	}
	public TipKupca getTip_kupca() {
		return tip_kupca;
	}
	public void setTip_kupca(TipKupca tip_kupca) {
		this.tip_kupca = tip_kupca;
	}
	
	
	
}
