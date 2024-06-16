package Timus;

//Исходные данные
//В первой строке записано целое число N (1 ≤ N ≤ 100) — количество пикселей на стороне квадратного монитора. Далее идут N строк, в каждой по N целых чисел в пределах от 1 до 100, разделенных пробелом. Это изображение, которое выводит обычная видеокарта (как видно, глубина цветности у нового монитора небольшая, все равно нормальному программисту больше ста цветов и не надо).
//Результат
//На выходе преобразователя должна получиться последовательность для ввода в новый монитор. Пиксели нумеруются от левого верхнего угла, по диагоналям, слева-направо и снизу-вверх. Подробнее объяснять тут долго и неинтересно, посмотрите на пример, дальше сами догадаетесь.

import java.util.Scanner;


public class Ttask_1313 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            int N = input.nextInt();
            int[][] imageUsual = new int[N][N];

            for (int row = 0; row < imageUsual.length; ++row) {
                for (int col = 0; col < imageUsual[0].length; ++col) {
                    imageUsual[row][col] = input.nextInt();
                }
            }

            for (int i = 0; i <= 2 * (N - 1); ++i) {
                for (int j = 0; j <= i; ++j) {
                    if ((i - j) < imageUsual.length && j < imageUsual[0].length) {
                        System.out.print(imageUsual[i - j][j] + " ");
                    }
                }
            }

            System.out.println();
        }
    }
}
