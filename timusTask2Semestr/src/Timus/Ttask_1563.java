package Timus;

//В первой строке записано целое число N — количество магазинов в Призме (1 ≤ N ≤ 1000).
// В каждой из следующих N строк записано название магазина — строка из латинских букв и пробелов длиной от 1 до 30.
// Известно, что в Призме нет магазинов, названия которых отличаются только регистром

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Ttask_1563 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            int N = input.nextInt();
            Set<String> store = new HashSet<String>(N);
            int BayanTimes = 0;

            input.nextLine();//¦Y±¼´«¦æ²Å¸¹
            while(N > 0){
                String storeName = input.nextLine();

                if(store.contains(storeName)){
                    ++BayanTimes;
                }
                else{
                    store.add(storeName);
                }

                --N;
            }

            System.out.println(BayanTimes);
        }
    }
}
