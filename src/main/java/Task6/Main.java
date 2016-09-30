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
public class Main
{
  public static void main(String[] args)
  {
    House[] house = new House[5];
    
    house[0] = new House(12, 120, 120, 1, 4, "г.Харьков, ул.Ньютона 188 ", "Панельный ");
    house[1] = new House(31, 34, 100, 3, 3, "г.Харьков, ул.Гоголя 14 ", "Кирпичный ");
    house[2] = new House(45, 12, 60, 9, 2, "г.Харьков, ул.Нариманова 12 ", "Панельный ");
    house[3] = new House(3, 145, 85, 12, 3, "г.Харьков, ул.Клочковская 122 ", "Панельный ");
    house[4] = new House(123, 111, 110, 5, 1, "г.Харьков, ул.Иванова 12 ", "Кирпичный ");
    
    System.out.println("Список квартир, имееющих заданное число комнат ");
    ListOfHouseRooms(house);
    System.out.println("");
    System.out.println("Список квартир, в заданном промежутке ");
    ListOfHouseRange(house);
    System.out.println("");
    System.out.println("Список квартир, имеющих площадь выше заданной  ");
    ListOfHouseSurpassing(house);
  }
  
  private static void ListOfHouseRooms(House[] houses){
    for (House house : houses) {
      if ((house != null) && (house.getQuantyti_rooms() >= 3)) {
        System.out.println(house);
      }
    }
  }
  
  private static void ListOfHouseRange(House[] houses){
    for (House house : houses) {
      if ((house != null) && (house.getQuantyti_rooms() >= 3) && (house.getFloor() >= 2)) {
        System.out.println(house);
      }
    }
  }
  
  private static void ListOfHouseSurpassing(House[] houses){
    for (House house : houses) {
      if ((house != null) && (house.getArea() >= 100)) {
        System.out.println(house);
      }
    }
  }
}
