package otherTasks.satelliteImagery;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    private static int amountPhotos;
    private static int[][] coordinates;

    public static void main(String[] args) {
        getData();
        go();
    }
    private static void go() {
        int maxX1 = 0,
                maxY1 = 0,
                maxX2 = 0,
                maxY2 = 0;

        for (int[] coordinate : coordinates) {
            for (int i = 0; i < coordinate.length; i++) {
                int value = Math.abs(coordinate[i]);
                if(value != 0) {
                    if (i == 0 && maxX1 < value) {
                        maxX1 = value;
                    }
                    if (i == 1 && maxY1 < value) {
                        maxY1 = value;
                    }
                    if (i == 2 && maxX2 < value) {
                        maxX2 = value;
                    }
                    if (i == 3 && maxY2 < value) {
                        maxY2 = value;
                    }
                }
            }
        }

        int maxX = maxX1 + maxX2,
                maxY = maxY1 + maxY2;

        long[][] totalArea = new long[maxY][maxX];

        int coordinateNum = 0;
        for (int[] coordinate : coordinates) {
            coordinateNum++;
            int x1 = 1,
                    y1 = 1,
                    x2 = 0,
                    y2 = 0;

            for (int i = 0; i < coordinate.length; i++) {
                int value = Math.abs(coordinate[i]);
                if (value != 0) {
                    if (i == 0) {
                        x1 = maxX1 - value;
                    }
                    if (i == 1) {
                        y1 = maxY1 - value;
                    }
                    if (i == 2) {
                        x2 = maxX1 + (value - 1);
                    }
                    if (i == 3) {
                        y2 = maxY1 + (value - 1);
                    }
                }
            }
            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    totalArea[j][i] = coordinateNum ;
                }
            }
        }

        for (int i = 1; i <= amountPhotos; i++) {
            int result = 0;
            for (long[] y : totalArea) {
                for (long numLastPhoto : y) {
                    if (numLastPhoto == i) {
                        result++;
                    }
                }
            }
            System.out.println(result);
        }
    }

    private static void getData() {
        Scanner sc = new Scanner(System.in);
        amountPhotos = sc.nextInt();
        sc.nextLine();
        coordinates = new int[amountPhotos][4];
        for (int i = 0; i < amountPhotos; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
            for (int j = 0; j < 4; j++) {
                coordinates[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
