
public class Q12 {

	public static void main(String[] args) {
		int flair=15;
		if(flair>= 15 && flair <37) {
			System.out.print("Not enough ");
		} if (flair==37) {
			System.out.print("just right ");
		} else {
			System.out.print("too many ");
		}
	}

}
// flair değeri 15 olduğu için önce ilk if bloğuna girer.
//Daha sonra ikinci if bloğunda 37 ye eşit olmadığı için o if bloğıunun else'ine otomatik düşer. 
//çıktımız not enough too many 