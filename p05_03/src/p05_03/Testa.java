/**
 * 
 */
package p05_03;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Testa {
	public int datua = 0; 				// instantziaren atributua
	public static int datuaStatic = 0; 	// klase-atributua (estatikoa)

	//instantzia-metodoa
	public void metodo () 
	{
		//this.datuaStatic++;
	}
	//klase-metodoa (estatikoa)
	public static void metodoStatic () 
	{
		//this.datuaStatic++;	// Horrek errorea ematen du konpilatzean metodo estatikoek this erreferentziarik ez dutelako 
		datuaStatic++;
	}

	public static void main (String [] args) 
	{
		//datua++; // Horrek errorea ematen du biltzean, metodo estatiko batek ezin dituelako estatikoak ez diren atributuak eskuratu.
		datuaStatic++;
		metodoStatic ();
		//metodo (); 	// Horrek errorea ematen du konpilatzean metodoa () ez delako estatikoa
	}
}
