package AcWing;

import java.util.*;

/**
 * 乘车问题
 */
public class Main06 {
    private static int[] a;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        while (count-- > 0) {
            int class_count = scanner.nextInt();
            int bus_limit = scanner.nextInt();
            int result = 0;
            a = new int[class_count];
            for (int i = 0; i < class_count; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < class_count;) {
                int bus_num = bus_limit;
                while (i < class_count) {
                    bus_num = bus_num - a[i];
                    if (bus_num >= 0) {
                        if (i == class_count - 1) {
                            result++;
                            i++;
                            break;
                        }
                        i++;
                    }else {
                        result++;
                        break;
                    }
                }
            }

            System.out.println(result);
        }
    }
}
