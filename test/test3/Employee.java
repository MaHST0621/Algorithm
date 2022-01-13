package test3;


public class Employee {
    private StringBuilder stringBuilder;
    private String name;
    private double salary;
    private static String my;
    private Integer id;
    {
        id = 1;
    }


    public Employee(String name, double salary) {
        this.stringBuilder = new StringBuilder();
        this.salary = salary;
        this.name = name;
    }

    public void hello() {
        System.out.println(this.getName() + " hello a ");
    }

    public final void test() {
        System.out.println("this is a test");
    }
    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public void setStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static String getMy() {
        return my;
    }

    public static void setMy(String my) {
        Employee.my = my;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
