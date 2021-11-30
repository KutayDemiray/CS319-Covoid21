package com.covoid21.panman.entity.user;

import com.covoid21.panman.entity.Course;

import java.util.Date;
import java.util.ArrayList;

public class Student extends User {
    private ArrayList<Course> coursesTaken;
    private Date entryDate;
    private String department;
    private String dormRoom;
}
