public class PlainPizzaWithoutGluten implements Pizza {
    public PlainPizzaWithoutGluten() {
        System.out.println("Adding Dough Without Gluten");
    }

    public String getDescription() {
        return "Dough Without Gluten";
    }

    public double getCost() {
        System.out.println("Cost of Dough Without Gluten: " + 6.00);
        return 6.00;
    }
}