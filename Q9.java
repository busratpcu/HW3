
public class Q9 {
	public void calculateResult(Integer candidateA, Integer candidateB) {
		boolean process = candidateA==null || candidateA.intValue() < 10;
		boolean value= candidateA && candidateB; // && boolean olan de�i�kenlerde kullan�l�r 
		System.out.println(process || value);	//candidateA ve candidateB Integer oldu�u i�in kod derlenmez.
	}
	public static void main(String[] args) {
		new Q9().calculateResult(null, 203);

	}

}
