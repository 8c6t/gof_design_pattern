package facade.case2;

public class Radio {

    private boolean turnedOn = false;

    public void turnOn() {
        turnedOn = true;
        System.out.println("Turn on a radio");
    }

    public void turnOff() {
        turnedOn = false;
        System.out.println("Turn off a radio");
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

}
