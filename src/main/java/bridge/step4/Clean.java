package bridge.step4;

public class Clean extends IAction {

    public Clean(IRobot robot) {
        super(robot);
    }

    public void doClean() {
        System.out.println("do clean");
    }

}
