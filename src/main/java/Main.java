/*1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
Реализовать в java.
2. Создать множество ноутбуков (ArrayList).
3. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
Выводить только те ноутбуки, что соответствуют условию.*/

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notebook MsiZ711 = new Notebook("MSI", "Z-711", "Black", 15.6, "LCD", 8, 256, "SSD");
        Notebook SamsungS101 = new Notebook("Samsung", "S-101", "Black", 15.6, "LCD", 8, 512, "SSD");
        Notebook SamsungS150 = new Notebook("Samsung", "S-150", "Green", 17.0, "TFT", 16, 512, "SSD");
        Notebook AsusTUF504 = new Notebook("ASUS", "TUF-504", "Grey", 15.6, "OLED", 32, 2048, "HDD 2.0");
        Notebook AsusTUF555 = new Notebook("ASUS", "TUF-555", "White", 15.6, "TFT", 16, 1024, "SSD");

        List<Notebook> notebookList = List.of(MsiZ711, SamsungS101, SamsungS150, AsusTUF504, AsusTUF555);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Выберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        int choiceUserSearch = scannerUser.nextInt();
        Scanner scannerRequestUserForSearch = new Scanner(System.in);
        System.out.println("Напишите интересующий цвет или бренд: ");
        String requestUserForSearch = scannerRequestUserForSearch.nextLine();

        if (choiceUserSearch == 1) {
            for (Notebook color : notebookList) {
                if (color.getColor().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(color.printInfo());
                }
            }

        } else if (choiceUserSearch == 2){
            for (Notebook brand : notebookList) {
                if (brand.getBrand().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(brand.printInfo());
                }
            }
        } else {
            System.out.println("Ошибка.\nВыберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        }

        scannerUser.close();

    }

}
