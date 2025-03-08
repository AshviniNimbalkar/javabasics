package com.in28minutes.oops.level2.collections;

import java.util.Comparator;

public class DescStudentComparator implements Comparator<Student > {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
