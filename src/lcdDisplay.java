public class lcdDisplay implements IObserver,IDisplay{

    int currentTemperature;
    public Thermometer thermometer;

    public lcdDisplay(Thermometer thermometer) {
        this.thermometer = thermometer;
        update();
    }

    @Override
    public void update() {
        currentTemperature = thermometer.getTemperature();
    }

    @Override
    public String display() {
        return "The temperature is: " + currentTemperature;
    }
}
