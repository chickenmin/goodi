package test0401;

interface DataAccessObject{
   void select();
   void insert();
   void update();
   void delete();
}


// OracleDao,MySqlDao


class OracleDao implements DataAccessObject{
    @Override
    public String toString() {
        return "Oracle DB";
    }

    @Override
    public void select() {
        System.out.println(this.toString()+ "에서 검색");
    }

    @Override
    public void insert() {
        System.out.println(this.toString()+ "에서 삽입");
    }

    @Override
    public void update() {
        System.out.println(this.toString()+ "에서 수정");
    }

    @Override
    public void delete() {
        System.out.println(this.toString()+ "에서 삭제");
    }
}

class MySqlDao implements DataAccessObject{
    @Override
    public String toString() {
        return "MySql DB";
    }

    @Override
    public void select() {
        System.out.println(this.toString()+ "에서 검색");
    }

    @Override
    public void insert() {
        System.out.println(this.toString()+ "에서 삽입");
    }

    @Override
    public void update() {
        System.out.println(this.toString()+ "에서 수정");
    }

    @Override
    public void delete() {
        System.out.println(this.toString()+ "에서 삭제");
    }
}


public class Test5 {
    private static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork(new OracleDao());
        System.out.println();
        dbWork(new MySqlDao());


    }
}
