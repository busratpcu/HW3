
public class Q50 {
	public static String play(int toy, int age) {
		final String game;
		if(toy<2)
			game= age > 1 ? 1 : 10;		// kodumuz bu satýrdan dolayý derlenmez. mismatch hatasý vermektedir.
			else
				game= age>3 ? "Ball" : "Swim";
		return game;
	}
	public static void main(String[] args) {
			System.out.println(play(5,2));
			
	}

}
