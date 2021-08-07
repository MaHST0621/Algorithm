package AcWing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 最大和
 */
public class Main02 {
    private static ArrayList<Integer> result = new ArrayList<>();

    public static void  getMaxs(int[] arrayList,int count_pik) {
        Arrays.sort(arrayList);
        int count = 0;
        for (int i = 0; i < count_pik; i++) {
            if (arrayList[i] < 0)
                count = count + Math.abs(arrayList[i]);
        }
        result.add(count);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count_test = scanner.nextInt();

        for (int i = 0; i < count_test; i++) {
            int count_num = scanner.nextInt();
            int count_pik = scanner.nextInt();
            int[] array = new int[count_num];
            for (int i1 = 0; i1 < count_num; i1++) {
                array[i1] = scanner.nextInt();
            }
            getMaxs(array,count_pik);
        }
        for (int i = 0; i < count_test; i++) {
            System.out.println(result.get(i));
        }
    }
}
