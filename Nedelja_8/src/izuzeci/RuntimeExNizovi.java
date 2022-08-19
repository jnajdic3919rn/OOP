package izuzeci;

public class RuntimeExNizovi {

	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3, 4, 5};
		try {
			for(int i = 0; i<7; i++) {
				System.out.println(a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Nemamo toliko elemenata u nizu");
		}
	
		System.out.println("Dalje izvrsavanje");
	}

}
