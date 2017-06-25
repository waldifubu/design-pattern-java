package strategy_hund;

public class Husky extends Hund {

	BellVerhalten bellVerhalten = new LeiseBellen();
	
	public void bellen(){ 
        bellVerhalten.bellen(); 
    } 

    public void setBellVerhalten(BellVerhalten bellVerhalten){ 
        this.bellVerhalten = bellVerhalten; 
    } 
}
