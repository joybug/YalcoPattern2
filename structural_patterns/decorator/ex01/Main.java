package structural_patterns.decorator.ex01;

public class Main {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(
            simpleCoffee.getDescription()
             + " $" + simpleCoffee.getCost()
        );
        
        Coffee milkCoffee = new MilkDecorator(
            new SimpleCoffee());
        System.out.println(
            milkCoffee.getDescription()
             + " $" + milkCoffee.getCost()
        );

        Coffee milkAndSugarCoffee = new SugarDecorator(
            new MilkDecorator(
                new SimpleCoffee()
            )
        );
        
        System.out.println(
            milkAndSugarCoffee.getDescription()
            + " $" + milkAndSugarCoffee.getCost()
        );
    }
}
