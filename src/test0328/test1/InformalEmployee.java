package test0328.test1;
import java.util.Date;
public class InformalEmployee extends Employee{
  public   Date expireDate;
    public int primaryPay;

    public InformalEmployee(String name, String address, String dept, Date expireDate, int primaryPay) {
        super(name, address, dept);
        this.expireDate = expireDate;
        this.primaryPay = primaryPay;
    }

    public int getPay() {
        return primaryPay;
    }

    public String toString() {
        return  super.toString() + "계약만료일:"+expireDate + "기본임금:" + primaryPay;
    }


}
