package com.yu.reflect;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by dayu on 2018/6/27
 */
public class ReflectTest {
    @Test
    public void fun2() throws Exception {
        /**
         * 一个jvm中只有一个class实例
         */
        //通过对象调用getClass()获取Class
        Person p1 = new Person();
        Class c = p1.getClass();
        System.out.println(c.getName());
        //通过类名.class
        Class c2 = Person.class;
        System.out.println(c2.getName());
        //通过Class对象的forname
        Class c3 = Class.forName("com.yu.reflect.Person");
        System.out.println(c3);
        Field[] declaredFields = c3.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }
        Method[] declaredMethods = c3.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }
        Object obj = c3.newInstance();
        System.out.println(obj);
    }


}
