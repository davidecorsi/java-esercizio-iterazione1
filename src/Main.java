import java.util.Scanner;

/*
 * Scrivete un applicazione che conti una serie di numeri finchè il totale dei numeri non superi 1000.
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int somma = 0;
		while(somma < 1000) {
			System.out.print("Inserisci il numero(totale=" + somma + ") ");
			int n = input.nextInt();
			somma += n;
		}
		System.out.println("La somma dei numeri è " + somma);
	}
}
