/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

/**
 *
 * @author vladyslav
 */
public class Main {

    public static void main(String[] args) {
        Customer[] customers = new Customer[5];
        long[] interval = {4141222253538484L, 7264111153538484L};

        customers[0] = new Customer(123,"Филип ", "Николаевич ", "Петросян ", "г.Харьков, ул.Ньютона 188 ", 4141222253538484L, "PJY23AA");
        customers[1] = new Customer(145,"Николай ", "Васильевич ", "Гоголь", "г.Харьков, ул.Гоголя 14 ", 5367825353538484L, "P12F3AA");
        customers[2] = new Customer(566,"Иван ", "Карпович", "Карпенко", "г.Харьков, ул.Нариманова 12 ", 9711259753538484L, "AAFAS23AA");
        customers[3] = new Customer(555,"Михаил ", "Михайлович ", "Кокшенов", "г.Харьков, ул.Клочковская 122 ", 7264111153538484L, "PHT53HNH");
        customers[4] = new Customer(154,"Михаил ", "Иванович ", "Пуговкин", "г.Харьков, ул.Иванова 12 ", 1122334453538484L, "FFYJ635A");
        
        for(Customer elem : customers) {
            System.out.println(elem.toString());
            System.out.println("------------------------");
        }
        
        System.out.println();
        System.out.println("Список абонентов в алфовитном порядке: ");
        usersAlphabet(customers);
        System.out.println();
        System.out.println("Cписок покупателей, у которых номер кредитной карточки находится в заданном интервале:");
        cardInInterval(interval, customers);
    }

    public static void usersAlphabet(Customer[] customers) {
        for (int i = 0; i < customers.length - 1; i++) {
            for (int j = 0; j < customers.length - i - 1; j++) {
                if (customers[j].getName().compareTo(customers[(j + 1)].getName()) > 0) {
                    Customer elem = customers[j];
                    customers[j] = customers[(j + 1)];
                    customers[(j + 1)] = elem;
                }
            }
        }
        for (Customer elem : customers) {
            System.out.println(elem.getName() + " " + elem.getSurname());
        }
    }

    public static void cardInInterval(long[] interval, Customer[] customers) {
        for (Customer elem : customers) {
            if ((elem.getCreditCardNumber() >= interval[0]) && (elem.getCreditCardNumber() <= interval[1])) {
                System.out.println(elem.getName() + " " + elem.getSurname());
            }
        }
    }
}
