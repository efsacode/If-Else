
public class Main {

	public static void main(String[] args) {
		int ogrenciYas = 23;
		if (ogrenciYas < 18 && ogrenciYas > 14) {
			System.out.println("Ogrenci lisededir");
		} else if (ogrenciYas < 15 && ogrenciYas > 7) {
			System.out.println("Ogrenci ilk ogretim ogrencisidir.");
		} else if (ogrenciYas > 18) {
			System.out.println("Universite ogrencisidir.");
		}
	}
}
