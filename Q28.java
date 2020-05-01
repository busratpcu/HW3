
public class Q28 {
	public static void main(String...in) {
	int intersections=100;
	int streets=200;
	if(intersections < 150){
		System.out.println("1");
	}
	else if(streets && intersections > 1000) {  // bu satır sebebiyle derlenmez.
		System.out.println("2");				//iki integer ifade arasında boolean ifadesi kullanılmaz.
	}
	if (streets < 500)
			System.out.println("1");
	else 
		System.out.println("2");
		
}
	}
