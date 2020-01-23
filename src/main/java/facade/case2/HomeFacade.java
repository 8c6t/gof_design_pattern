package facade.case2;

public class HomeFacade {

    private Computer computer;
    private Light light;
    private Radio radio;

    public HomeFacade(Computer computer, Light light, Radio radio) {
        this.computer = computer;
        this.light = light;
        this.radio = radio;
    }

    public void homeIn() {
        System.out.println("home in");
        if (!computer.isTurnedOn()) {
            computer.turnOn();
        }

        if (!light.isTurnedOn()) {
            light.turnOn();
        }

        if (!radio.isTurnedOn()) {
            radio.turnOn();
        }
    }

    public void homeOut() {
        System.out.println("home out");
        if (computer.isTurnedOn()) {
            computer.turnOff();
        }

        if (light.isTurnedOn()) {
            light.turnOff();
        }

        if (radio.isTurnedOn()) {
            radio.turnOff();
        }
    }

}
