package zajecia.car1;

public class CarControler {
    Car car;

    public CarControler(Car car) {
        this.car = car;
    }

    public void turbo() {
        car.power = (int)car.power * 1.1;
    }

    public void increaseSpeed(int speed) {
        car.actualSpeed  += speed;
    }

    public void decreaseSpeed(int speed) {
        car.actualSpeed  += speed;
    }

    @Override
    public String toString() {
        return "CarControler{" +
                "car=" + car +
                '}';
    }
}
