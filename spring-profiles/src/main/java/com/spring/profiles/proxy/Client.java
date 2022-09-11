package com.spring.profiles.proxy;

public class Client {

    public static void main(String[] args) {

        ITEmployee itEmployee = new ITEmployee();
        itEmployee.setId(1);
        itEmployee.setName("Pushkar");
        itEmployee.setSalary(60000);

        itEmployee.giveHike(10000);
        System.out.println(itEmployee.getSalary());

    }
}
