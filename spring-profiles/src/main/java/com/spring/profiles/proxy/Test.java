package com.spring.profiles.proxy;

import java.lang.reflect.Constructor;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

        Class<?> studentInfo = Class.forName("com.spring.profiles.proxy.Student");
        Constructor<?>[] constructor = studentInfo.getConstructors();

        for (Constructor cons : constructor) {

            System.out.println(cons);

        }

    }
}
