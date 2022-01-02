package AcWingWeek.TwentyNine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Line> list = new ArrayList<>();
        long max = 0;
        while (n-- > 0) {
            long low = scanner.nextLong();
            long high = scanner.nextLong();
            if (high > max) {max = high;}
            list.add(new Line(low,high));
        }
        if (n == 1) {
            Line line = list.get(0);
            System.out.println(line.high - line.low + 1);
            return;
        }

        long size = list.size();
        int[] result = new int[Math.toIntExact(max + 1)];
        for (int i = 0; i < size;i++) {
            Line out = list.get(i);
            for (int j = Math.toIntExact(out.low); j <= out.high; j++) {
                result[j] = result[j] + 1;
            }
        }
        int[] result_int = new int[Math.toIntExact(max + 1)];
        for (int i = 0; i <= max; i++) {
            if (result[i] != 0){
                result_int[result[i] - 1] = result_int[result[i] - 1] + 1;
            }
        }

        for (int i : result_int) {
            System.out.println(i);
        }

    }

    public static class Line{
        long low;
        long high;

        public Line(long low,long high) {
            this.low = low;
            this.high = high;
        }
    }
}
