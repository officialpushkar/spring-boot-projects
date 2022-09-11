package com.spring.profiles.proxy;

public class StudentProxy extends Student {

    public StudentProxy(Attendance attendance) {
        super(attendance);
    }

    @Override
    public void attendSession() {

        if (!super.getAttendance().isPresent()) {
            throw new RuntimeException("Student is absent");
        }
        super.attendSession();
    }
}
