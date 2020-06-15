package zajecia.car1;

public class Car {
    String name;
    double power;
    int actualSpeed;

    public Car(String name, int power, int actualSpeed) {
        this.name = name;
        this.power = power;
        this.actualSpeed = actualSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getActualSpeed() {
        return actualSpeed;
    }

    public void setActualSpeed(int actualSpeed) {
        this.actualSpeed = actualSpeed;
    }




    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", actualSpeed=" + actualSpeed +
                '}';
    }
}
