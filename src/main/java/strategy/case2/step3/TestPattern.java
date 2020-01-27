package strategy.case2.step3;

public class TestPattern {

    public static void main(String[] args) {
        DatabaseUse myDB = new DatabaseUse();
        myDB.connect();

        myDB.setDatabase(new MySQL());
        myDB.connect();
        myDB.select();

        myDB.setDatabase(new Infomix());
        myDB.connect();
        myDB.select();

        myDB.setDatabase(new Oracle());
        myDB.connect();
        myDB.select();
    }

}
