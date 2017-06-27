package strategy_deutsch;

public class Klient {

	public static void main(String[] args) {
		Kontext k = new Kontext();
		k.setStrategie(new KonkreteStrategieA());
		k.arbeite(); // "Weg A"
		k.setStrategie(new KonkreteStrategieB());
		k.arbeite(); // "Weg B"
	}
}

/**
Check list
----------
1. Identify an algorithm (i.e. a behavior) that the client would prefer to access through a "flex point".
2. Specify the signature for that algorithm in an interface.
3. Bury the alternative implementation details in derived classes.
4. Clients of the algorithm couple themselves to the interface.


Rules of thumb
--------------
Strategy is like Template Method except in its granularity.
State is like Strategy except in its intent.
Strategy lets you change the guts of an object. Decorator lets you change the skin.
State, Strategy, Bridge (and to some degree Adapter) have similar solution structures. They all share elements of the 'handle/body' idiom. They differ in intent - that is, they solve different problems.
Strategy has 2 different implementations, the first is similar to State. The difference is in binding times (Strategy is a bind-once pattern, whereas State is more dynamic).
Strategy objects often make good Flyweights.
**/