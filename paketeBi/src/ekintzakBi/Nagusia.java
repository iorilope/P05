/*
 * 2023(e)ko aza. 28(a)
 * Ioritz Lopetegi
 */
package ekintzakBi;

import java.util.Scanner;

import matematikak.Eragiketak;

// TODO: Auto-generated Javadoc
/**
 * The Class Nagusia.
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
