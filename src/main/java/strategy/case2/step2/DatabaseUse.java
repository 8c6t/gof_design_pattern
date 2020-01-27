package strategy.case2.step2;

enum DBTYPE { MySQL, Infomix, Oracle };

public class DatabaseUse {

    private Database db;

    public void connect(DBTYPE dbtype) {
        switch (dbtype) {
        case MySQL:
            db = new MySQL();
            break;
        case Infomix:
            db = new Infomix();
            break;
        case Oracle:
            db = new Oracle();
            break;
        }

        if (db == null) {
            System.out.println("데이터베이스를 먼저 선택하세요");
        } else {
            db.connectDatabase();
        }
    }

    public void select() {
        db.selectData();
    }

}
