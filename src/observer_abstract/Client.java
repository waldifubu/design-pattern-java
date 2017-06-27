package observer_abstract;

public class Client {

	public static void main(String[] args) {
		ConcreteSubject concreteSubject = new ConcreteSubject();

		ConcreteObserverA a = new ConcreteObserverA();
		ConcreteObserverB b = new ConcreteObserverB();
		concreteSubject.register(a);
		concreteSubject.register(b);

		concreteSubject.setState(77);
		// Concrete Observer A is updated with 77
		// Concrete Observer B is updated with 77	
		
		concreteSubject.unregister(b);
		concreteSubject.setState(13);
	}
}