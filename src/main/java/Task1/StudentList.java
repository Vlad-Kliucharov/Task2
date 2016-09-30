/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

import java.util.ArrayList;

/**
 *
 * @author vladyslav
 */
class StudentList {

    private ArrayList<Student> studentsList = new ArrayList();

    public void addStudent(Student a) {
        this.studentsList.add(a);
    }

    public void facultyPrint(String faculty) {
        System.out.println("Список студентов факультета: " + faculty);
        for (Student student : this.studentsList) {
            if (student.getFaculty().equals(faculty)) {
                System.out.println(student.toString());
            }
        }
    }

    public void groupPrint(String group) {
        System.out.println("Список студентов заданной группы: " + group);
        for (Student student : this.studentsList) {
            if (student.getGroup().equals(group)) {
                System.out.println(student.toString());
            }
        }
    }

    public void yearOfBirthPrint(String year) {
        System.out.println("Список студентов, родившихся после заданного года: " + year);
        for (Student student : this.studentsList) {
            if (parseYear(student.getDateOfBirth().substring(6)) > parseYear(year)) {
                System.out.println(student.toString());
            }
        }
    }

    public void facultyCoursePrint(String faculty, String course) {
        System.out.println("Список студентов факультета: " + faculty + ",Курс: " + course);
        for (Student student : this.studentsList) {
            if ((student.getFaculty().equals(faculty) & student.getCourse().equals(course))) {
                System.out.println(student.toString());
            }
        }
    }

    public int parseYear(String years) {
        return Integer.parseInt(years);
    }
}
