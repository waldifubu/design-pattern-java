package observer_zeitung;

public class FamilieMeier implements Abonnent {

	@Override
	 public void erhalteZeitung(Zeitung zeitung) { 
        System.out.println("Familie Meier erhielt die aktuelle Zeitung: " + zeitung.getTitel()); 
    } 

}
