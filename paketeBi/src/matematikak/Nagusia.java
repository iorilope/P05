/**
 * 
 */
package matematikak;

import java.util.Scanner;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Nagusia {

	/**
	 * @param args
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
