import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считывание 5 строк для списка A
        ArrayList<String> listA = new ArrayList<>();
        System.out.println("Введите 5 строк для списка A:");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }

        // Отображение списка A
        System.out.println("Список A:");
        for (String str : listA) {
            System.out.println(str);
        }

        // Считывание 5 строк для списка B
        ArrayList<String> listB = new ArrayList<>();
        System.out.println("Введите 5 строк для списка B:");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }

        // Отображение списка B
        System.out.println("Список B:");
        for (String str : listB) {
            System.out.println(str);
        }

        // Объединение списков A и B в новый список C
        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i)); // A1, A2, A3, A4, A5
            listC.add(listB.get(4 - i)); // B5, B4, B3, B2, B1
        }

        // Отображение списка C
        System.out.println("Список C после объединения:");
        for (String str : listC) {
            System.out.println(str);
        }

        // Сортировка списка C по длине строк
        Collections.sort(listC, (a, b) -> Integer.compare(a.length(), b.length()));

        // Отображение отсортированного списка C
        System.out.println("Отсортированный список C по длине строк:");
        for (String str : listC) {
            System.out.println(str);
        }
    }
}