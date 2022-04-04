package Solution_3;

public class Car {
    String carModel;

    public Car(String carModel) {
        this.carModel = carModel;
    }

    class Engine {
        boolean isWorking = false;
        int horsepower;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }

        String startStopEngine() {
            if (isWorking == true) {
                isWorking = false;
                return "engine was stopped";
            } else {
                isWorking = true;
                return "engine was started";
            }
        }
    }
}
