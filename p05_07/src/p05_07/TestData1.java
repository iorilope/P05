/*
 * 2023(e)ko aza. 22(a)
 * Ioritz Lopetegi
 */
package p05_07;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
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

		Data g = new Data();
		System.out.println("Sartu eguna");
		int Eguna = sc.nextInt();
		g.setEguna(Eguna);
		System.out.println("Sartu Hilabetea");
		int Hilabetea = sc.nextInt();
		g.setHilabetea(Hilabetea);
		System.out.println("Sartu Urtea");
		int Urtea = sc.nextInt();
		g.setUrtea(Urtea);

		Data a = new Data();
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
		System.out.println(	 a.equals(g));
		sc.close();
	}

}
