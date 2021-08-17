package test;

import java.math.BigDecimal;
import java.util.*;

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
        HashMap<Object, Object> hashMap = new HashMap<>();
    }
}
