/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

/**
 *
 * @author vladyslav
 */

public class Main{
    
  public static void main(String[] args){
      
    Student student1 = new Student("Филип ", "Николаевич ", "Петросян ", "01.01.1998", "38044555667712", "Философия ", "1", "123");
    Student student2 = new Student("Николай ", "Васильевич ", "Гоголь", "12.04.1997", "38044555667713", "Инженерия ", "2", "321");
    Student student3 = new Student("Иван ", "Карпович", "Карпенко", "10.07.1996", "38044555667714", "Инженерия ", "3", "231");
    Student student4 = new Student("Михаил ", "Михайлович ", "Кокшенов", "04.09.1999", "38044555667715", "Философия ", "1", "123");
    Student student5 = new Student("Михаил ", "Иванович ", "Пуговкин", "03.04.1998", "38044555667716", "Экономика ", "2", "321");
    
    StudentList newList = new StudentList();
    newList.addStudent(student1);
    newList.addStudent(student2);
    newList.addStudent(student3);
    newList.addStudent(student4);
    newList.addStudent(student5);
    newList.facultyPrint("Инженерия");
    newList.groupPrint("123");
    newList.yearOfBirthPrint("1997");
    newList.facultyCoursePrint("Философия", "1");
  }
}
