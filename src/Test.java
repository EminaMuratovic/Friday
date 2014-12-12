
public class Test {
	public static void main(String[] args) {
		Temperature prva = new Temperature();
		Temperature druga = new Temperature(20, 'K');
		Temperature treca = new Temperature(80, 'C');
		Temperature cetvrta = new Temperature(100, 'F');
		
		System.out.println(prva.toString());
		System.out.println(druga.toString());
		System.out.println(treca.toString());
		System.out.println(cetvrta.toString());
		System.out.println();
		
		
		System.out.println(prva.getCelsius(prva.letter));
		
		Temperature peta;
		peta = new Temperature(prva);
		System.out.println();
		System.out.println(peta.toString());
		
	}

}
