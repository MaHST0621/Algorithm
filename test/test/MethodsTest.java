package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MethodsTest  {
    public static void main(String[] args) throws Exception {
        Class clzz = Class.forName("test.Student");
        Constructor cn = clzz.getConstructor(null);

        Method[] methods = clzz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Method[] methods1 = clzz.getDeclaredMethods();
        for (Method method : methods1) {
            System.out.println(method.getName());
        }

        Method method = clzz.getMethod("show1", int.class);
        Method method1 = clzz.getMethod("show1",String.class);
        Method method2 = clzz.getDeclaredMethod("show4", int.class);

        Object object = cn.newInstance();

        method.invoke(object,100);
        method1.invoke(object,"hello");
        method2.setAccessible(true);
        method2.invoke(object,200);
    }
}
