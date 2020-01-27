package strategy.case1.step2;

public class AObj {

    BInterface bInterface;

    public AObj() {
        this.bInterface = new BImplement();
    }

    public void SomeFunc() {
        bInterface.funcA();
        bInterface.funcA();
    }

}
