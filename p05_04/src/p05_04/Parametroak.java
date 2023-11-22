/**
 * 
 */
package p05_04;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Parametroak {
	public static void aldatu(int x) {
		x++;
	}

	public static void aldatu2(int [] par) {
		par [0] ++;
	}

	public static void main (String [] args) {
		int zbk1 = 0;
		int [] zbki2 = { 0 };

		aldatu (zbk1 );
		System.out.println ("1. zenbakia:" + zbk1 );
		aldatu2 (zbki2 );
		System.out.println ("2. zenbakia:" + zbki2 [0]);
	}

}

//Emaitza 1 zenbakia 0 da aldagai sinplea baita ,orde zbk2 array batean dagoenez elementua eguneratu egingo da

