/*
 * 2023(e)ko aza. 28(a)
 * Ioritz Lopetegi
 */
package p05_11;

// TODO: Auto-generated Javadoc
/**
 * The Class Haurtxoa.
 */
public class Haurtxoa
{

	/**
	 * Instantiates a new haurtxoa.
	 *
	 * @param i the adina
	 */
	Haurtxoa(int i)
	{
		this("Ondo hazi gabeko haurra naiz");
		System.out.println("Kaixo, " + i + " hilabete ditut");
	}

	/**
	 * Instantiates a new haurtxoa.
	 *
	 * @param s the izena
	 */
	Haurtxoa(String s)
	{
		System.out.println( "Kaixo " + s + " izena dut");
	}

	/**
	 * Negar egin.
	 */
	void NegarEgin() {
		System.out.println("Buaaaaaaaaaa");
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new Haurtxoa("Xabier").NegarEgin();
	}

}

//Kode honek Ondo hazi gabeko haurra naiz Kaixo, 8 hilabete ditut  Buaaaaaaaaaa egingo du, aldatu dezakegu string baten bidez