package facade.case2;

public class Light {

    private boolean turnedOn = false;

    public void turnOn() {
        turnedOn = true;
        System.out.println("Turn on a light");
    }

    public void turnOff() {
        turnedOn = false;
        System.out.println("Turn off a light");
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

}
