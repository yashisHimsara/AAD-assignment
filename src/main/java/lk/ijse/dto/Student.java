package lk.ijse.dto;

import java.io.*;
public class Student {

        private static final long serialVersionUID = 1L;
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', age=" + age + "}";
        }
    }
