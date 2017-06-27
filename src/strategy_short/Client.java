package strategy_short;

public class Client { 

    public static void main(String[] args) { 
        //Default Verhalten 
        Context context = new Context(); 
        context.setStrategy(new ConcreteStrategyA());
        
        context.execute(); 

        //Verhalten ändern 
        context.setStrategy(new ConcreteStrategyB()); 
        context.execute(); 
    } 

}  