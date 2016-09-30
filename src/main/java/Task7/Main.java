/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task7;

import java.util.Arrays;

/**
 *
 * @author vladyslav
 */
public class Main {

    public static void main(String[] args) {
        Phone[] phone = new Phone[5];

        phone[0] = new Phone(126, "Филип ", "Николаевич ", "Петросян ", "г.Харьков, ул.Ньютона 188 ", 1000, 500);
        phone[1] = new Phone(421, "Николай ", "Васильевич ", "Гоголь", "г.Харьков, ул.Гоголя 14 ", 500, 0);
        phone[2] = new Phone(146, "Иван ", "Карпович", "Карпенко", "г.Харьков, ул.Нариманова 12 ", 5500, 2500);
        phone[3] = new Phone(454, "Михаил ", "Михайлович ", "Кокшенов", "г.Харьков, ул.Клочковская 122 ", 200, 495);
        phone[4] = new Phone(675, "Михаил ", "Иванович ", "Пуговкин", "г.Харьков, ул.Иванова 12 ", 50, 0);

        for(Phone elem : phone) {
            System.out.println(elem.toString());
            System.out.println("------------------------");
        }
        
        System.out.println();
        System.out.println("Список абонентов привышающих время городских разговоров: ");
        ListOfPredeterminedTime(phone);
        System.out.println();
        System.out.println("Список абонентов пользовавшихся междугородней связью: ");
        ListOfInternationalCalls(phone);
        System.out.println();
        System.out.println("Список абонентов в алфовитном порядке: ");
        ListOfAlphabet(phone);
    }

    private static void ListOfPredeterminedTime(Phone[] phone_book) {
        for (Phone phone : phone_book) {
            if ((phone != null) && (phone.getCity_calls() >= 1000)) {
                System.out.println(phone);
            }
        }
    }

    private static void ListOfInternationalCalls(Phone[] phone_book) {
        for (Phone phone : phone_book) {
            if ((phone != null) && (phone.getInternational_calls() >= 1)) {
                System.out.println(phone);
            }
        }
    }

    private static void ListOfAlphabet(Phone[] phone_book) {
        for (int i = 0; i < phone_book.length - 1; i++) {
            for (int j = 0; j < phone_book.length - i - 1; j++) {
                if (phone_book[j].getName().compareTo(phone_book[(j + 1)].getName()) > 0) {
                    Phone elem = phone_book[j];
                    phone_book[j] = phone_book[(j + 1)];
                    phone_book[(j + 1)] = elem;
                }
            }
        }
        for (Phone elem : phone_book) {
            System.out.println(elem.getName() + " " + elem.getSurname());
        }
    }
}
