/* Napisa� funkcj� liczZnakiSlowa, kt�ra zlicza:
 * � liczb� znak�w w pliku,
 * � liczb� bia�ych znak�w w pliku (bia�e znaki to spacja, tabulator, znacznik
 * ko�ca wiersza),
 * � liczb� s��w w pliku.
 * Wynikiem funkcji jest tablica z�o�ona z 3 liczb ca�kowitych po jednej dla wymienionych
 * podpunkt�w.
 */
import java.io.*;
public class Zad1 {
	public static void liczZnakiSlowa(String filePath) throws Exception {
		String tekst;
		int i;
		File file = new File("Zad1.txt");
		FileReader f = new FileReader(file);
		BufferedReader b = new BufferedReader(f);
		tekst = b.readLine();
		do {
		    System.out.println(tekst);
		  
		    tekst = b.readLine();
		  } while(tekst != null);
		
		  b.close();
		  }
	
	public static void main(String[] args) {
		
		}
}
