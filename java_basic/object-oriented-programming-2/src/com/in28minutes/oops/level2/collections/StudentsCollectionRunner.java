package com.in28minutes.oops.level2.collections;

import java.util.*;

public class StudentsCollectionRunner {
    public static void main(String[]args) {
        List<Student> studentList = List.of(new Student(1, "Rajveer"), new Student(2, "Ranjit"));
        List<Student> studentArrayList = new ArrayList<>(studentList);
        Collections.sort(studentArrayList);
        /*Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId() - o2.getId();
            }*/
        //});
        System.out.println(studentArrayList);
        Collections.sort(studentArrayList,new DescStudentComparator());
        System.out.println(studentArrayList);

    }

}
