package observer_abstract;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private final List<Observer> observerList = new ArrayList<Observer>();

	public void register(Observer newObserver) {
		System.out.println(newObserver.getClass().getSimpleName() + " is registered");
		observerList.add(newObserver);
	}

	public void unregister(Observer newObserver) {
		System.out.println("Removed " + newObserver.getClass().getSimpleName());
		observerList.remove(newObserver);
	}

	protected void notifyObservers(int state) {
		for (Observer observer : observerList) {
			observer.update(state);
		}
	}
}
