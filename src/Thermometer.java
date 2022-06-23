import java.util.ArrayList;
import java.util.List;

public class Thermometer implements IObservable{

    private List<IObserver> observers = new ArrayList<>();
    private int temperature = 20;

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach( observer -> observer.update());
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }

    public List<IObserver> getObservers() {
        return observers;
    }
}
