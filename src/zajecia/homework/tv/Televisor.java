package zajecia.homework.tv;

public class Televisor {
    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean turnOn () {
        return isOn = true;
    }

    public boolean turnOff() {
        return isOn = false;
    }

    public void  status() {
        System.out.println(isOn);
    }
}
