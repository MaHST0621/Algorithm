package test;

public class Animal {
    private Integer age;

    public Animal(int age) {
        this.age = age;
    }

    public void breath() {
        System.out.println("i am breathing and" + age + "old");
    }
}
