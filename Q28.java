
public class Q28 {
	public static void main(String...in) {
	int intersections=100;
	int streets=200;
	if(intersections < 150){
		System.out.println("1");
	}
	else if(streets && intersections > 1000) {  // bu sat�r sebebiyle derlenmez.
		System.out.println("2");				//iki integer ifade aras�nda boolean ifadesi kullan�lmaz.
	}
	if (streets < 500)
			System.out.println("1");
	else 
		System.out.println("2");
		
}
	}
