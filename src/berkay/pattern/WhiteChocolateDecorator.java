package berkay.pattern;

public class WhiteChocolateDecorator extends AddOnDecorator {

    private Beverage beverage;


    public WhiteChocolateDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 3;
    }
}
