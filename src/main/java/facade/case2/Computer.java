package facade.case2;

public class Computer {

    private boolean turnedOn = false;

    public void turnOn() {
        turnedOn = true;
        System.out.println("Turn on a computer");
    }

    public void turnOff() {
        turnedOn = false;
        System.out.println("Turn off a computer");
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

}
