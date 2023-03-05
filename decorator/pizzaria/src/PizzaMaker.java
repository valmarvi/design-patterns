
public class PizzaMaker {

    public static void main(String[] args) {

        // The PlainPizza object is sent to the Mozzarella constructor
        // and then to the TomatoSauce constructor

        Pizza basicPizza = new Mushrooms(new TomatoSauce(new Mozzarella(new PlainPizza())));
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());

        Pizza glutenFreePizza = new TomatoSauce(new Mushrooms(new PlainPizzaWithoutGluten()));
        System.out.println("Ingredients: " + glutenFreePizza.getDescription());
        System.out.println("Price: " + glutenFreePizza.getCost());
    }

}
