
public class Q20 {

	public static void main(String[] args) {
		int leaders= 10 * (2 + (1 + 2 / 5));
		int followers= leaders * 2;
		System.out.println(leaders + followers <10 ? "too few" : "too many");
		
	}

}
//5. sat�rdaki eksik parantez sebebiyle kodumuz derlenmez.
// Eksik parantez tmamland���nda ��kt�m�z too many olur
