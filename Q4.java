
public class Q4 {

	public static void main(String[] args) {
		int plan=1;
		plan=plan++ + --plan;
		if(plan==1) {
			System.out.println("Plan A");
		}
		else {if(plan==2) System.out.println("Plan B");
		} else 								//Bu else ifadesinin ba�l� oldu�u bir if deyimi olmad��� i�in kodumuz derlenmez.
			System.out.println("Plan C");
	}

}
