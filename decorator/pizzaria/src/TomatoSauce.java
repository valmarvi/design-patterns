public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Tomato Sauce");
    }

    // Returns the result of calling getDescription() for
    // PlainPizza, Mozzarella and then adds TomatoSauce to it

    public String getDescription(){
        return tempPizza.getDescription() + ", Tomato Sauce";
    }

    public double getCost(){
        System.out.println("Cost of Tomato Sauce: " + .35);
        return tempPizza.getCost() + .35;
    }
}