/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task4;

/**
 *
 * @author vladyslav
 */
public class Abiturient{
    
  private int id;
  private String name;
  private String surname;
  private String patronymic;
  private String address;
  private int mark;
  private String point;
  
  public Abiturient(int id, String name, String surname, String patronymic, 
          String address, int mark, String point){
      
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.patronymic = patronymic;
    this.address = address;
    this.mark = mark;
    this.point = point;
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
  
  public String getSurname(){
    return this.surname;
  }
  
  public void setSurname(String surname){
    this.surname = surname;
  }
  
  public String getPatronymic(){
    return this.patronymic;
  }
  
  public void setPatronymic(String patronymic){
    this.patronymic = patronymic;
  }
  
  public String getAddress(){
    return this.address;
  }
  
  public void setAddress(String address){
    this.address = address;
  }
  
  public int getMark(){
    return this.mark;
  }
  
  public void setMark(int mark){
    this.mark = mark;
  }
  
  public String getPoint(){
    return this.point;
  }
  
  public void setPoint(String point){
    this.point = point;
  }
  
  @Override
  public String toString(){
    return "Абитуриент {id = " + this.id + ",Имя = " + this.name + ",Фамилия = " 
            + this.patronymic + ",Отчество = " + this.surname + ",Адрес = " 
            + this.address + ",Баллы = " + this.point + ",Оценка = " + this.mark + "}";
  }
}
