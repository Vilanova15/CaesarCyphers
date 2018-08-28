
public class CaesarCypher {
	//Instance variables
	private int key; //Todas las instancias tienen un key, pero distinto
	
	private final static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	private static String shiftedAlphabet;
	
	//Creando el constructor method
	public CaesarCypher(int key) {
		this.key = key;
		String leftSubstring = alphabet.substring(0,key);
		String rightSubstring = alphabet.substring(key);
		shiftedAlphabet = rightSubstring = leftSubstring;
	}
}
