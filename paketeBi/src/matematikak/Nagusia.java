/*
 * 2023(e)ko aza. 21(a)
 * Ioritz Lopetegi
 */
package matematikak;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 *  Class Nagusia.
 */
public class Nagusia {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Sartu zenbaki bat");
		Eragiketak.z1 = sc.nextInt();

		System.out.println("Sartu  beste zenbaki bat");
		Eragiketak.z2 = sc.nextInt();


		System.out.println(Eragiketak.batura(Eragiketak.z1, Eragiketak.z2));
		System.out.println(Eragiketak.potentzia(Eragiketak.z1, Eragiketak.z2));

		sc.close();
	}

}
