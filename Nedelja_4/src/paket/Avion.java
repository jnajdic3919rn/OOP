package paket;

public class Avion {

	private String model;
	private int krila;
	
	public Avion(String model) {
		this.model = model;
	}
	public Avion(String model, int krila) {
		this.model = model;
		this.krila = krila;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getKrila() {
		return krila;
	}

	public void setKrila(int krila) {
		this.krila = krila;
	}

	public void poleti() {
		System.out.println("Avion je poleteo");
	}
	
	public void sleti() {
		System.out.println("Avion je sleteo");
	}
}
