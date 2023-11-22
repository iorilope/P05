/**
 * 
 */
package p05_05;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class KudeatuLaukizuzena {
    public static void main(String[] args) {

    	Laukizuzena    r1  = new Laukizuzena(5, 7);
    	Laukizuzena    r2 = new Laukizuzena();
    	Laukizuzena    r3= new Laukizuzena(r1);

            r2.handituZabalera();
            r2.handituAltua();
            System.out.println("Altua:" + r1.getAltuera());
        System.out.println("Zabalera:" + r1.getZabalera());

        Laukizuzena    r4 = new Laukizuzena(5, 7);
        Laukizuzena    r5 = new Laukizuzena(5, 7); 
        Laukizuzena    r6 = new Laukizuzena(r4);

            System.out.println();
            if (r4.equals(r5)) // Konparatu erreferentziak eta kasu honetan ez dira berdinak
                System.out.println("r4 eta r5 berdinak dira");

            if (r4.equals(r6)) // Konparatu erreferentziak eta kasu honetan berdinak diren
                System.out.println("r4 eta r6 berdinak dira");

            System.out.println(); System.out.println(r1.toString());
            System.out.println(r2.toString());
            System.out.println(r3.toString());
    System.out.println(r4.toString());
    System.out.println(r5.toString());
    System.out.println(r6.toString());
        }

}
