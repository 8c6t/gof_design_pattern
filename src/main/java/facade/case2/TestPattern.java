package facade.case2;

public class TestPattern {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Light light = new Light();
        Radio radio = new Radio();

        // 기존 방식
        computer.turnOff();
        light.turnOff();
        radio.turnOff();

        // 파사드 패턴 적용
        HomeFacade home = new HomeFacade(computer, light, radio);
        home.homeIn();

    }

}
