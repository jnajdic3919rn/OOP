package paket;

public class BorbeniAvion extends Avion{

	private boolean bombe;
	
	public BorbeniAvion(String model, int krila) {
		super(model, krila);
	}
	
	public void poleti() {
		System.out.println("Borbeni avion je poleteo");
	}
	public void pucaj() {
		System.out.println("Avion je pucao");
	}

}
