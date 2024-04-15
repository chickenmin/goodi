package test0328.test1;

public class FormalEmployee extends  Employee{
  public   int salary;
          public String empNo;
    public String position;

    public FormalEmployee(String name, String address, String dept, String empNo, String position, int salary) {
        super(name, address, dept);
        this.salary = salary;
        this.empNo = empNo;
        this.position = position;
    }

    public int getPay() {

        return salary/12;
    }

    @Override
    public String toString() {
        return super.toString() + "직원번호=" + empNo + ",직급=" + position +",연봉 =" + salary;
    }


}
