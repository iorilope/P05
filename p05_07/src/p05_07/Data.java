/*
 * 2023(e)ko aza. 28(a)
 * Ioritz Lopetegi
 */
package p05_07;

// TODO: Auto-generated Javadoc
/**
 * The Class Data.
 */
public class Data
{

	/** The eguna. */
	private int eguna;

	/** The hilabetea. */
	private int hilabetea;

	/** The urtea. */
	private int urtea;

	/**
	 * Instantiates a new data.
	 */
	public Data()
	{
	}

	/**
	 * Instantiates a new data.
	 *
	 * @param e the eguna
	 * @param h the hilabetea
	 * @param u the urtea
	 */
	public Data(int e, int h, int u)
	{
		eguna     = e;
		hilabetea = h;
		urtea     = u;
	}

	/**
	 * Gets the eguna.
	 *
	 * @return the eguna
	 */
	public int getEguna() {
		return eguna;
	}

	/**
	 * Sets the eguna.
	 *
	 * @param eguna the new eguna
	 */
	public void setEguna(int eguna) {
		this.eguna = eguna;
	}

	/**
	 * Gets the hilabetea.
	 *
	 * @return the hilabetea
	 */
	public int getHilabetea() {
		return hilabetea;
	}

	/**
	 * Sets the hilabetea.
	 *
	 * @param hilabetea the new hilabetea
	 */
	public void setHilabetea(int hilabetea) {
		this.hilabetea = hilabetea;
	}

	/**
	 * Gets the urtea.
	 *
	 * @return the urtea
	 */
	public int getUrtea() {
		return urtea;
	}

	/**
	 * Sets the urtea.
	 *
	 * @param urtea the new urtea
	 */
	public void setUrtea(int urtea) {
		this.urtea = urtea;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	// Object-etik jasotako metodoa gainidatziko dugu data nahi den formatuan erakusteko
	public String toString() {
		return urtea + "/" + hilabetea + "/" + eguna;
	}

	/**
	 * Equals.
	 *
	 * @param o the o
	 * @return true, if successful
	 */
	// Object-etik jasotako metodoa gainidatziko dugu, atributuen balioak bat datozenean true itzul dezan eta, kasu kontsolidarioan, huts egin dezan
	public boolean equals(Object o) {
		Data bestea = (Data) o;
		return eguna == bestea.eguna && hilabetea == bestea.hilabetea && urtea == bestea.urtea;
	}
}