
public class Q15 {

	public static void main(String[] args) {
		int hops= 0;
		int jumps=0;
		jumps=hops++;
		if(jumps)						// jmups deðeri bir ibnteger ve if içerisinde herhangi bir karþýlaþtýrma ifadesi yer almadýðý için kodumuz derlenmez 
			System.out.println("Jump");
		else
			System.out.println("Hop");
	}

}
