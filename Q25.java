
public class Q25 {
	public static String travel (int distance) {
		return distance<1000 ? "train" : 10; //int'dan stringe d�n���m hatas� vermektedir. retun ile d�nd�rmek istedi�imiz ifade hem string hem de integer. Bu y�zden kod derlenmez.
	}
	public static void main(String[] args) {
		System.out.println(travel(500));
	}

}
