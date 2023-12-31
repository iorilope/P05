/*
 * 2023(e)ko aza. 28(a)
 * Ioritz Lopetegi
 */
package p05_08;

import java.util.Scanner;



// TODO: Auto-generated Javadoc
/**
 * 
 * @author Ioritz Lopetegi
 */

//Interfazea sortu metodoekin
interface Data {
	public void setEguna(int eguna); 
	public void setHilabetea(int hilabetea); 
	public void setUrtea(int urtea);
	public String toString();
	public boolean equals(Object o);

}
//Interfazea inplementatu gure klasean
class SETDATA implements Data {

	public int eguna;
	public int hilabetea;
	public int urtea;

	public void setEguna(int eguna) {

		this.eguna = eguna;

	}
	public void setHilabetea(int hilabetea) {
		this.hilabetea = hilabetea;
	}
	public void setUrtea(int urtea) {
		this.urtea = urtea;
	}
}


/**
 * The Class TestData1.
 */
public class TestData1 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		SETDATA g = new SETDATA();

		System.out.println("Sartu eguna");
		int Eguna = sc.nextInt();
		g.setEguna(Eguna);
		System.out.println("Sartu Hilabetea");
		int Hilabetea = sc.nextInt();
		g.setHilabetea(Hilabetea);
		System.out.println("Sartu Urtea");
		int Urtea = sc.nextInt();
		g.setUrtea(Urtea);

		SETDATA a = new SETDATA();
		System.out.println("Sartu eguna");
		int Eguna2 = sc.nextInt();
		a.setEguna(Eguna2);
		System.out.println("Sartu Hilabetea");
		int Hilabetea2 = sc.nextInt();
		a.setHilabetea(Hilabetea2);
		System.out.println("Sartu Urtea");
		int Urtea2 = sc.nextInt();
		a.setUrtea(Urtea2);

		//Ikusi berdinak diren
		if (a.equals(g)) {
			System.out.println("Datak berdinak dira");
		}
		else {
			System.out.println("Datak desberdinak dira");
		}
		sc.close();
	}

}
