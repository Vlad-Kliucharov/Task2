/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3;

/**
 *
 * @author vladyslav
 */
public class Main {

    public static void main(String[] args) {
        Patient[] patient = new Patient[5];

        patient[0] = new Patient(466, "Филип ", "Николаевич ", "Петросян ", "г.Харьков, ул.Ньютона 188 ", "0935556633", 147859, "Перелом руки ");
        patient[1] = new Patient(31, "Николай ", "Васильевич ", "Гоголь", "г.Харьков, ул.Гоголя 14 ", "0664344432", 23659, "Перелом руки ");
        patient[2] = new Patient(432, "Иван ", "Карпович", "Карпенко", "г.Харьков, ул.Нариманова 12 ", "0636523654", 123789, "Простуда ");
        patient[3] = new Patient(122, "Михаил ", "Михайлович ", "Кокшенов", "г.Харьков, ул.Клочковская 122 ", "0955558525", 62147, "Перелом ноги ");
        patient[4] = new Patient(431, "Михаил ", "Иванович ", "Пуговкин", "г.Харьков, ул.Иванова 12 ","0956658525", 62147, "Простуда ");
        
        for (Patient elem : patient) {
            System.out.println(elem.toString());
            System.out.println("-----------------------");

        }

        System.out.println("Список диагнозов");
        listOfDiagnosis(patient);
        System.out.println();
        System.out.println("Список мед карт");
        listOfNumberMedicalCard(patient);
    }

    private static void listOfDiagnosis(Patient[] patients) {
        System.out.println("Перелом руки");
        for (Patient patient : patients) {
            if ((patient != null) && (patient.getDiagnosis().equals("Перелом руки "))) {
                System.out.println(patient);
            }
        }
        System.out.println("Простуда ");
        for (Patient patient : patients) {
            if ((patient != null) && (patient.getDiagnosis().equals("Простуда "))) {
                System.out.println(patient);
            }
        }
        System.out.println("Перелом ноги ");
        for (Patient patient : patients) {
            if ((patient != null) && (patient.getDiagnosis().equals("Перелом ноги "))) {
                System.out.println(patient);
            }
        }
    }

    private static void listOfNumberMedicalCard(Patient[] patients) {
        System.out.println("от 0 до 100 000");
        for (Patient patient : patients) {
            if ((patient != null)
                    && (patient.getNumberMedicalCard() <= 100000)) {
                System.out.println(patient);
            }
        }
        System.out.println("от 100 001 до 200 000");
        for (Patient patient : patients) {
            if ((patient != null) && (patient.getNumberMedicalCard() > 100000) && (patient.getNumberMedicalCard() <= 200000)) {
                System.out.println(patient);
            }
        }
    }
}
