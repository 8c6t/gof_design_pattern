package observer.case2.step2;

public class MyClassB implements Observer {

    Publisher observable;
    private boolean bPlay;  // 실행 여부

    public MyClassB(Publisher o) {
        this.observable = o;
        observable.addObserver(this);
    }

    @Override
    public void update(boolean play) {
        this.bPlay = play;
        myActControl();
    }

    public void myActControl() {
        if (bPlay){
            System.out.println("MyClassB: 동작 시작");
        } else {
            System.out.println("MyClassB: 동작 정지");
            observable.deleteObserver(this);
        }
    }

}
