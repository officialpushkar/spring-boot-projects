package com.spring.profiles.proxy;

import java.util.Date;

public class Teacher {

    public static void main(String[] args) {

        DailySession session = new StudentProxy(new Attendance(new Date(), false));
        session.attendSession();
    }
}
