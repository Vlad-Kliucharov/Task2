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
public class Student{
    
  private int id;
  private static int nextId = 0;
  private String name;
  private String patronymic;
  private String dateOfBirth;
  private String surname;
  private String phoneNumber;
  private String faculty;
  private String course;
  private String group;
  
  public Student(String name, String patronymic, String surname, String dateOfBirth, 
          String phoneNumber, String faculty, String course, String group){
      
    this.name = name;
    this.patronymic = patronymic;
    this.surname = surname;
    this.dateOfBirth = dateOfBirth;
    this.phoneNumber = phoneNumber;
    this.faculty = faculty;
    this.course = course;
    this.group = group;
    this.id = (nextId++);
  }
  
  public int getId(){
    return this.id;
  }
  
  public void setId(int id){
    this.id = id;
  }
  
  public String getName(){
    return this.name;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  public String getMiddleName(){
    return this.name;
  }
  
  public void setPatronymic(String patronymic){
    this.patronymic = patronymic;
  }
  
  public String getSurname(){
    return this.surname;
  }
  
  public void setSurname(String surname){
    this.surname = surname;
  }
  
  public String getPhoneNumber(){
    return this.phoneNumber;
  }
  
  public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
  }
  
  public String getFaculty(){
    return this.faculty;
  }
  
  public void setFaculty(String faculty){
    this.faculty = faculty;
  }
  
  public String getCourse(){
    return this.course;
  }
  
  public void setCourse(String course){
    this.course = course;
  }
  
  public String getGroup(){
    return this.group;
  }
  
  public void setGroup(String group){
    this.group = group;
  }
  
  public String getDateOfBirth(){
    return this.dateOfBirth;
  }
  
  public void setDateOfBirth(String dateOfBirth){
    this.dateOfBirth = dateOfBirth;
  }
  
  @Override
  public String toString(){
    return "Студент { id " + this.id + ",Имя = " + this.name + ",Отчество = " 
            + this.patronymic + ",Фамилия = " + this.surname + ",Год рождения = " 
            + this.dateOfBirth + ",Номер телефона = " + this.phoneNumber 
            + ",Факультет = " + this.faculty + ",Курс = " + this.course 
            + ",Группа = " + this.group + '}';
  }
}
