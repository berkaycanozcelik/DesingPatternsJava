package berkay.pattern;

public class CaramelDecorator extends AddOnDecorator {

    private Beverage beverage;


    public CaramelDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 2;
    }
}
