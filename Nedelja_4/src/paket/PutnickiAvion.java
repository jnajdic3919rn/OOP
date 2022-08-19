package paket;

public class PutnickiAvion extends Avion{

	private int brojRezervacija;
	
	public PutnickiAvion(String model, int krila) {
		super(model, krila);
	}

	public void rezervisiMesto() {
		brojRezervacija++;
		System.out.println("Rezervisano " + brojRezervacija + " mesta");
	}
	
}
