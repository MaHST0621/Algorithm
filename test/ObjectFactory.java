package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @Author Mahe
 * @Date 2021/4/21 17:22
 * @Version 1.0
 */
	//使用反射

class Person{
	private String name;

	public Person(){
		this.name = "匿名";
		System.out.println("匿名");
	}

	public Person(String name ) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void run(int meters) {
		System.out.printf("%s 跑了 %d 米 %n",name,meters);
	}

	public String toString() {
		return "姓名: " + name;
	}

	private void helper() {
		System.out.println("私有辅助类方法");
	}
}
public class ObjectFactory {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
//		//使用反射创建对象
//		//forName来获取Class实例
//		Class clz = Class.forName(args[0]);
//		//得到无参的共有方法
//		Constructor noArgCons = clz.getConstructor();
//		//使用无参构造方法
//		Object obj = noArgCons.newInstance();
//		//使用一个参数构造器
//		Class paramClz = args[0].getClass();
//
//		Constructor oneArgCons = paramClz.getConstructor(paramClz);
//		obj = oneArgCons.newInstance(args[1]);

//		//使用反射调用对象方法
//		//Method类
//		//得到run方法对应的Method对象
//		Class<?> clzz = Class.forName("test.Person");
//
//		Constructor oneArg = clzz.getConstructor(String.class);
//		Object objj = oneArg.newInstance("张三");
//		Method mth = clzz.getMethod("run",int.class);
//
//		//调用run方法
//		//invoke 可以调用方法对象
//		mth.invoke(objj,800);
//
//		//得到helper方法对应的Method对象
//		mth = clzz.getDeclaredMethod("helper");
//		//helper方法是私有的，正常不可调用的
//		//通过调用Method对象的setAccessible(true)
//		//将helper方法设置为可访问的
//		mth.setAccessible(true);
//		mth.invoke(objj);

		//使用反射修改对象的字段（访问）
		//Filed类

		Class clzz01 = Class.forName("test.Person");
		Constructor oneArgCons01 = clzz01.getConstructor(String.class);
		Object obj01 = oneArgCons01.newInstance("王雷");

		//得到name字段
		Field f = clzz01.getDeclaredField("name");
		//name字段是私有的
		//调用Filed对象的SetAccessible方法将其设置为可访问的
		f.setAccessible(true);
		//设置字段为李四
		f.set(obj01,"王雷爸爸");
		System.out.println(obj01);
		//也可以用Metod提供的set
		Method mth01 = clzz01.getMethod("setName", String.class);
		mth01.invoke(obj01,"王雷妈妈");
		System.out.println(obj01);
		f.setAccessible(false);
	}
}
