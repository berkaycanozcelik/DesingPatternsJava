public class MobileApp implements IObserver, IDisplay{

    private Thermometer thermometer;

    public MobileApp(Thermometer thermometer) {
        this.thermometer = thermometer;
        update();
    }

    private int currentTemperature;

    @Override
    public String display() {
        return "Temperature shown in the widget is: " + currentTemperature;
    }

    @Override
    public void update() {
        currentTemperature = thermometer.getTemperature();
    }
}
