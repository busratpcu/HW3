
public class Q15 {

	public static void main(String[] args) {
		int hops= 0;
		int jumps=0;
		jumps=hops++;
		if(jumps)						// jmups de�eri bir ibnteger ve if i�erisinde herhangi bir kar��la�t�rma ifadesi yer almad��� i�in kodumuz derlenmez 
			System.out.println("Jump");
		else
			System.out.println("Hop");
	}

}
