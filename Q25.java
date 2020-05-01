
public class Q25 {
	public static String travel (int distance) {
		return distance<1000 ? "train" : 10; //int'dan stringe dönüþüm hatasý vermektedir. retun ile döndürmek istediðimiz ifade hem string hem de integer. Bu yüzden kod derlenmez.
	}
	public static void main(String[] args) {
		System.out.println(travel(500));
	}

}
