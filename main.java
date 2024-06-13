public class main {
    public static void main(String[] args) {
        CoffeeMachine drink = new CoffeeMachine(5, 1);
        System.out.println(drink.name);
        WarmDrink drink2 = new WarmDrink(1, 2, 3);
        System.out.println(drink2.temperature);
        WarmDrink drink3 = new WarmDrink(2, 5);
        System.out.println(drink3.name);
        drink2.getProduct();

    }
}
