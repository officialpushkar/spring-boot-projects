package com.spring.profiles.proxy;

import java.util.Date;

public class Attendance {

    private Date date;
    private boolean isPresent;


    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public Attendance(Date date, boolean isPresent) {
        this.date = date;
        this.isPresent = isPresent;
    }
}
