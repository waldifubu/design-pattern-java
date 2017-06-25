package observer_zeitung;

public class FirmaXY implements Abonnent {

	@Override
	 public void erhalteZeitung(Zeitung zeitung) { 
        System.out.println("Firma XY erhielt die aktuelle Zeitung: " + zeitung.getTitel()); 
    } 

}
