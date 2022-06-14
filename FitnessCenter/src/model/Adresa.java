package model;

public class Adresa {

	private String ulica;
	private String broj;
	private String grad;
	private int postanski_broj;
	
	public Adresa(String ulica, String broj, String grad, int postanski_broj) {
		super();
		this.ulica = ulica;
		this.broj = broj;
		this.grad = grad;
		this.postanski_broj = postanski_broj;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public int getPostanski_broj() {
		return postanski_broj;
	}

	public void setPostanski_broj(int postanski_broj) {
		this.postanski_broj = postanski_broj;
	}

	@Override
	public String toString() {
		return "Adresa [ulica=" + ulica + ", broj=" + broj + ", grad=" + grad + ", postanski_broj=" + postanski_broj
				+ "]";
	}
	
	
	
}
