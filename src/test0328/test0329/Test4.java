package test0328.test0329;

import test0328.test1.Employee;
import test0328.test1.FormalEmployee;
import test0328.test1.InformalEmployee;

import java.util.Date;

class TempEmployee extends Employee {
    int timePay, empTime;

    public TempEmployee(String name,String address, String dept, int timePay, int empTime  ) {
        super(name, address, dept);
        this.timePay = timePay;
        this.empTime = empTime;
    }

    @Override
    public int getPay() {
        return timePay * empTime;
    }
}
public class Test4 {
    public static void main(String[] args) {
        Employee[] emps = new Employee[3];
        emps[0] = new FormalEmployee("박정규","서울","총무부",
                "001","과장",50000000);
        Date exDate = new Date(); //오늘 날짜
        exDate.setTime(exDate.getTime()
                + (1000L*60*60*24*365));
        System.out.println(exDate);
        emps[1] = new InformalEmployee("유비정","서울","기획부",
                exDate,1000000);
        emps[2] = new TempEmployee("손임시","서울","영업부",
                25000,10);
        long total = 0;
        for(Employee e : emps) {
            System.out.println(e.type + "=>" + e.name + ":"
                    + e.getPay());
            total += e.getPay();
        }
        System.out.println("전체 직원 급여:" + total);
    }
}
