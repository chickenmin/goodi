package test0328.test1;

public abstract class Employee {
  public   String type, name, address, dept;

    public Employee(String name,String address, String dept) {
        this.type = type;
        this.name = name;
        this.address = address;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

   public abstract int getPay();
}
