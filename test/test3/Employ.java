package test3;

public class Employ extends Employee{

    //当父类没有默认的构造方法（无参构造）时，需要子类调用父类提供的有参构造函数
    public Employ(String name, double salary) {
        super(name, salary);
    }
    public Employ(String name) {
        super(name,0);

    }

    public void hello() {
        System.out.println("this is a test");
    }


}
