package adapter.case2;

public class TestPattern {

    public static void main(String[] args) {
        // 기존에 사용하던 방식
        APlayer player1 = new APlayerImpl();
        player1.play("aaa.mp3");

        // 새로 도입된 방식
        BPlayer player2 = new BPlayerImpl();
        player2.playFile("bbb.mp3");

        // 어댑터 적용
        APlayer player3 = new BToAAdapter();
        player3.play("ccc.mp3");

    }

}
