/*  Napisa� funkcj�:
public static void szukaj(String nazwaPlikWe, String nazwaPlikWy,
String slowo)
kt�rej zadaniem jest znalezienie wszystkich wierszy w pliku, kt�re zawieraj� szukane
s�owo. Wszystkie wiersze, kt�re zawieraj� s�owo powinny zosta� zapisane w
pliku wynikowym wraz z nr wiersza (z pierwszego pliku). Nazwa pierwszego pliku
zapami�tana jest w parametrze nazwaPlikWe, nazwa pliku wynikowego podana
jest w parametrze nazwaPlikWy, natomiast szukane s�owo w parametrze slowo.
Przyk�ad - plik wej�ciowy:
Ala ma jutro egzamin z biologii.
Jan myje auto.
Eh, jutro kolejny egzamin.
Nie lubie polityki.
Je�eli szukanym s�owem by�oby �egzamin�, to plik wynikowy powinien wygl�da�
nast�puj�co:
1: Ala ma jutro egzamin z biologii.
3: Eh, jutro kolejny egzamin.
 */
import java.io.*;
import java.util.*;
public class Zad2 {

	public static void szukaj(String nazwaPlikWe, String nazwaPlikWy, String slowo) throws Exception {
		int t;
		String tekst, k = "";
		System.out.println("Tekst: ");
		System.out.println("");
		File plik = new File("Zad2.txt");
		FileReader f = new FileReader(plik);
		BufferedReader b = new BufferedReader(f);
		tekst = b.readLine();
		do {
		    System.out.println(tekst);
		    tekst = b.readLine();
		   } while(tekst != null);
		Scanner s = new Scanner(System.in);
		System.out.println("");
		System.out.println("Podaj szukane s�owo: ");
		slowo = s.nextLine();
		StringTokenizer st = new StringTokenizer(tekst);
		while(st.hasMoreTokens()) {
			k+=st;
			while(k==slowo) {
				System.out.println("k");
			}
		}
		s.close();
		b.close();
	}
	
	public static void main(String[] args) throws Exception {
		Zad2.szukaj(null, null, null);
	}
}
