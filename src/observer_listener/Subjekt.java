package observer_listener;

public interface Subjekt {
	public void addBeobachter(Beobachter beobachter);
	public void removeBeobachter(Beobachter beobachter);
	public void notifyAlleBeobachter();
}
