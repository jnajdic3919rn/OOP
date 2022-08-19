package paket;

public class Main {

	public static void main(String[] args) {
		Avion a1 = new Avion("model1");
		Avion a2 = a1;
		a2.setModel("model2");
		System.out.println(a1.getModel());
	}

}
