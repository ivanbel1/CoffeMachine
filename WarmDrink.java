public class WarmDrink extends CoffeeMachine {
    public int temperature;

    public WarmDrink(int temperature, int name, int volume) {
        super(name, volume);
        this.temperature = temperature;
    }

    public WarmDrink(int name, int volume) {
        super(name, volume);
    }

    public void getProduct() {
        System.out.printf("Name:%s Temperature:%d° volume:%d", name, temperature, volume);
    }
}