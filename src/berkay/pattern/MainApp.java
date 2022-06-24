package berkay.pattern;

public class MainApp {
    public static void main(String[] args) {

        var caramelEspresso = new CaramelDecorator(new Espresso());

        System.out.println("Cost of a Caramel berkay.pattern.Espresso is: " + caramelEspresso.cost() + "$");

        System.out.println(caramelEspresso.desc());

        var whiteChocolateEspressoWithCaramel = new WhiteChocolateDecorator(new CaramelDecorator(new Espresso()));

        System.out.println("Cost of a White Chocolate berkay.pattern.Espresso with Caramel is: " + whiteChocolateEspressoWithCaramel.cost() + "$");

    }
}
