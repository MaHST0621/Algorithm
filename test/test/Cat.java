package test;

public class Cat extends Animal {
    private String nikname;

    public Cat(String nikname,int age) {
        super(age);
        this.nikname = nikname;
    }

    public void getrun() {
        System.out.println("i am " + nikname + " runnig ");
    }
}
