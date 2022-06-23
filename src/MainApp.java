public class MainApp {
    public static void main(String[] args) {

        var thermometer = new Thermometer();

        var livingRoomDisplay = new lcdDisplay(thermometer);
        var samsungApp = new MobileApp(thermometer);

        thermometer.add(livingRoomDisplay);
        thermometer.add(samsungApp);

        System.out.println(samsungApp.display());
        System.out.println(livingRoomDisplay.display());

        thermometer.setTemperature(25);
        thermometer.notifyObserver();

        System.out.println(samsungApp.display());
        System.out.println(livingRoomDisplay.display());



    }
}
