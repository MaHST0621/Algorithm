package test3;

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("线程ID: " + Thread.currentThread().getId());
        System.out.println("线程名称" + Thread.currentThread().getName());
        System.out.println("线程状态" + Thread.currentThread().getState());
        Thread thread = new Thread();
        System.out.println("线程ID: " + thread.getId());
        System.out.println("线程名称" + thread.getName());
        System.out.println("线程状态" + thread.getState());
    }
}
