package strategy.case2.step2;

public class TestPattern {

    public static void main(String[] args) {
        DatabaseUse myDB = new DatabaseUse();

        myDB.connect(DBTYPE.MySQL);
        myDB.select();

        myDB.connect(DBTYPE.Infomix);
        myDB.select();
    }

}
