package observer_zeitung;

public class FamilieFischer implements Abonnent {

	@Override
	 public void erhalteZeitung(Zeitung zeitung) { 
        System.out.println("Familie Fischer erhielt die aktuelle Zeitung: " + zeitung.getTitel()); 
    } 

}
