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
public class Main
{
  public static void main(String[] args)
  {
    Abiturient[] abiturient = new Abiturient[5];
    
    abiturient[0] = new Abiturient(466, "Филип ", "Николаевич ", "Петросян ", "г.Харьков, ул.Ньютона 188 ",55,"Неудовлетворительно ");
    abiturient[1] = new Abiturient(234, "Николай ", "Васильевич ", "Гоголь", "г.Харьков, ул.Гоголя 14 ", 75, "Хорошо ");
    abiturient[2] = new Abiturient(321, "Иван ", "Карпович", "Карпенко", "г.Харьков, ул.Нариманова 12 ", 85, "Хорошо ");
    abiturient[3] = new Abiturient(201, "Михаил ", "Михайлович ", "Кокшенов", "г.Харьков, ул.Клочковская 122 ", 101, "Отлично ");
    abiturient[4] = new Abiturient(188, "Михаил ", "Иванович ", "Пуговкин", "г.Харьков, ул.Иванова 12 ", 59, "Неудовлетворительно ");
    
    for (Abiturient elem : abiturient) {
            System.out.println(elem.toString());
            System.out.println("-----------------------");

        }
    
    System.out.println("Список оценок абитуриентов ");
    ListOfMark(abiturient);
    System.out.println("");
    System.out.println("Список оценок абитуриентов сумма балов выше заданной ");
    ListOfGoodMark(abiturient);
    System.out.println("Список оценок абитуриентов сумма балов ниже заданной ");
    ListOfBadMark(abiturient);
  }
  
  
  private static void ListOfMark(Abiturient[] abiturients){
    System.out.println("Неудовлетворительно ");
    for (Abiturient abiturient : abiturients) {
      if ((abiturient != null) && (abiturient.getPoint().equals("Неудовлетворительно "))) {
        System.out.println(abiturient);
      }
    }
    
    System.out.println("Хорошо ");
    for (Abiturient abiturient : abiturients) {
      if ((abiturient != null) && (abiturient.getPoint().equals("Хорошо "))) {
        System.out.println(abiturient);
      }
    }
    
    System.out.println("Отлично ");
    for (Abiturient abiturient : abiturients) {
      if ((abiturient != null) && (abiturient.getPoint().equals("Отлично "))) {
        System.out.println(abiturient);
      }
    }
  }
  
  private static void ListOfGoodMark(Abiturient[] abiturients){
    for (Abiturient abiturient : abiturients) {
      if ((abiturient != null) && (abiturient.getMark() > 100) && (abiturient.getMark() >= 101)) {
        System.out.println(abiturient);
          System.out.println("");
      }
    }
  }
  
  private static void ListOfBadMark(Abiturient[] abiturients){
    for (Abiturient abiturient : abiturients) {
      if ((abiturient != null) && (abiturient.getMark() < 60)) {
        System.out.println(abiturient);
      }
    }
  }
}
