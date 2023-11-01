import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа находит площадь поверхности и объем прямоугольного параллелепипеда");
        System.out.print("Введите значение первого ребра параллелепипеда : ");
        int rebro1 = scanner.nextInt();

        System.out.print("Введите значение второго ребра параллелепипеда : ");
        int rebro2 = scanner.nextInt();

        System.out.print("Введите значение третего ребра параллелепипеда : ");
        int rebro3 = scanner.nextInt();

        int ResultSquare = 2 * ((rebro1 * rebro2) + (rebro1 * rebro3) + (rebro2 * rebro3));
        System.out.println("Площадь поверхности параллелепипеда " + ResultSquare);
        int ResultVolume = (rebro1 * rebro2 * rebro3);
        System.out.println("Объем параллелепипеда " + ResultVolume);


    }


}