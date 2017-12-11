/* Napisaæ funkcjê liczZnakiSlowa, która zlicza:
 * • liczbê znaków w pliku,
 * • liczbê bia³ych znaków w pliku (bia³e znaki to spacja, tabulator, znacznik
 * koñca wiersza),
 * • liczbê s³ów w pliku.
 * Wynikiem funkcji jest tablica z³o¿ona z 3 liczb ca³kowitych po jednej dla wymienionych
 * podpunktów.
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
