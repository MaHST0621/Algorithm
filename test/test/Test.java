package test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {

    interface A{
        default void idea() {
            System.out.println("this is A;");
        }
        void test();
    }

    interface B{
    }

    abstract static class C {
        void test() {
            System.out.println("this is a test_c");
        }
        static void dd() {
            System.out.println("this is static");
        }
    }

    static class D  extends C implements A,B {
        public void getName() {
            System.out.println("this is" + this.getClass());
        }

        @Override
        public void test() {
            System.out.println("this is a test");
            super.test();
        }
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>(15);
        list.add(15);
        list.add(5);
        list.add(1,8);
        list.add(1,20);
    }
}
