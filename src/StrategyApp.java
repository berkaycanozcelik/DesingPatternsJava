public class StrategyApp {
    public static void main(String[] args) {

        var rubberDuck = new Duck(new NoFlyBehaviour(), new CleanDisplayBehaviour(), new SimpleQuackBehaviour());

        System.out.println(rubberDuck.fly());
        System.out.println(rubberDuck.display());
        System.out.println(rubberDuck.quack());

        var mallardDuck = new Duck(new SimpleFlyBehaviour(), new DirtyDisplayBehaviour(), new SimpleQuackBehaviour());

        System.out.println(mallardDuck.fly());
        System.out.println(mallardDuck.display());
        System.out.println(rubberDuck.quack());

    }
}
