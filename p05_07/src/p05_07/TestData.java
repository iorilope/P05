/*
 * 2023(e)ko aza. 28(a)
 * Ioritz Lopetegi
 */
package p05_07;

// TODO: Auto-generated Javadoc
/**
 * The Class TestData.
 */
public class TestData
{
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		Data f = new Data();
		f.setEguna(3);
		f.setHilabetea(10);
		f.setUrtea(1970);

		System.out.println("Eguna=" + f.getEguna());
		System.out.println("Hilabetea=" + f.getHilabetea());
		System.out.println("Urtea=" + f.getUrtea());
		System.out.println(f);

	}
}