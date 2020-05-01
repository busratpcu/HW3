
public class Q9 {
	public void calculateResult(Integer candidateA, Integer candidateB) {
		boolean process = candidateA==null || candidateA.intValue() < 10;
		boolean value= candidateA && candidateB; // && boolean olan deðiþkenlerde kullanýlýr 
		System.out.println(process || value);	//candidateA ve candidateB Integer olduðu için kod derlenmez.
	}
	public static void main(String[] args) {
		new Q9().calculateResult(null, 203);

	}

}
