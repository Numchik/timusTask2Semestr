package Timus;
//В единственной строке через пробел записаны целые числа n и k — количество мест в том ряду, где сидит Вася,
// и номер его места соответственно (1 ≤ k ≤ n ≤ 50; n чётно). Места в ряду нумеруются с единицы.

import java.util.Scanner;

public class Ttask_1725 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        scanner.close();

        int left = k - 1;
        int right = n - k;

        int maxStumbles = 1;

        System.out.println(maxStumbles);
    }
}
