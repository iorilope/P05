/**
 * 
 */
package p05_02;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Kohetea 
{
	private  int koheteKop = 0;  // atributU estatikoa edo klasekoa
	// kasu honetan ez dago instantzia-atributurik

	// eskaera-metodoak (kasu honetan ez dago metodo estatikorik edo klase-metodorik)
	//eraikitzailea
	Kohetea () 
	{
		koheteKop++;
	}

	public int getKohetea () {
		return koheteKop;
	}

}