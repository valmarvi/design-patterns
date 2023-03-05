public class Mushrooms extends ToppingDecorator {

    public Mushrooms(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Mushrooms");
    }

    // Returns the result of calling getDescription() for
    // PlainPizza, Mozzarella and then TomatoSauce

    public String getDescription(){

        return tempPizza.getDescription() + ", mushrooms";

    }

    public double getCost(){

        System.out.println("Cost of mushrooms: " + .50);

        return tempPizza.getCost() + .50;

    }

}