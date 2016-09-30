/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task6;

/**
 *
 * @author vladyslav
 */
public class House{
    
  private int id;
  private int number_apartment;
  private int area;
  private int floor;
  private int quantyti_rooms;
  private String street;
  private String building_type;
  
  public House(int id, int number_apartment, int area, int floor, 
          int quantyti_rooms, String street, String building_type){
      
    this.id = id;
    this.number_apartment = number_apartment;
    this.area = area;
    this.floor = floor;
    this.quantyti_rooms = quantyti_rooms;
    this.street = street;
    this.building_type = building_type;
  }
  
  public int getId(){
    return this.id;
  }
  
  public void setId(int id){
    this.id = id;
  }
  
  public int getNumber_apartment(){
    return this.number_apartment;
  }
  
  public void setNumber_apartment(int number_apartment){
    this.number_apartment = number_apartment;
  }
  
  public int getArea(){
    return this.area;
  }
  
  public void setArea(int area){
    this.area = area;
  }
  
  public int getFloor(){
    return this.floor;
  }
  
  public void setFloor(int floor){
    this.floor = floor;
  }
  
  public int getQuantyti_rooms(){
    return this.quantyti_rooms;
  }
  
  public void setQuantyti_rooms(int quantyti_rooms){
    this.quantyti_rooms = quantyti_rooms;
  }
  
  public String getStreet(){
    return this.street;
  }
  
  public void setStreet(String street){
    this.street = street;
  }
  
  public String getBuilding_type(){
    return this.building_type;
  }
  
  public void setBuilding_type(String building_type){
    this.building_type = building_type;
  }
  
  @Override
  public String toString(){
    return "Квартира {id=" + this.id + ",Номер квартиры = " + this.number_apartment 
            + ",Площадь = " + this.area + "м.кв." + ",Этаж = " + this.floor 
            + ",Количество комнат = " + this.quantyti_rooms + ",Улица = " 
            + this.street + ",Тип Строения = " + this.building_type + "}";
  }
}
