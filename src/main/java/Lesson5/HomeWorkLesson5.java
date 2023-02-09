package Lesson5;

import java.util.Objects;

public class HomeWorkLesson5 {
    static int[][] getMap() {
        return new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, -1, 0, 0, 0, 0, 0},
                {0, 0, -1, 0, -1, 0, -1, 0},
                {0, 0, -1, 0, 0, 0, -1, 0},
                {0, 0, -1, 0, 0, 0, -1, 0},
                {0, -1, -1, -1, -1, -1, -1, 0},
                {0, 0, -1, 0, 0, 0, -1, 0},
                {0, 0, -1, 0, 0, 0, -1, 0},
                {0, 0, 0, 0, 0, 0, -1, 0},
                {0, 0, 0, 0, 0, 0, -1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
    }

    public static void pprint(int[][] m) {
        int rows = m.length;
        int colums = m[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                if (m[i][j] == -1)
                    System.out.printf("%s", "|  ");
                else if (m[i][j] == 1)
                    System.out.printf("%s", "A  ");
                else if (m[i][j] == -2)
                    System.out.printf("%s", "B ");
                else if (m[i][j] == -3)
                    System.out.printf("%s", "*  ");
                else if (m[i][j] < 10)
                    System.out.printf("%s", "0" + m[i][j] + " ");
                else
                    System.out.printf("%s", m[i][j] + " ");

            }
            System.out.println();
        }

    }
    public static void pprint2(int[][] m) {
        int rows = m.length;
        int colums = m[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                if (m[i][j] == -1)
                    System.out.printf("%s", "|  ");
                else if (m[i][j] == 1)
                    System.out.printf("%s", "A  ");
                else if (m[i][j] == -2)
                    System.out.printf("%s", "B  ");
                else if (m[i][j] == -3)
                    System.out.printf("%s", "*  ");
                else
                    System.out.printf("%s", "00 " );


            }
            System.out.println();
        }

    }

    public static void start(int[][] map, int x, int y) {
        map[x - 1][y - 1] = 1;
    }

    public static void end(int[][] map, int x, int y) {
        map[x - 1][y - 1] = -2;
    }

    public static boolean isValidIndex(int[][] arr, int x, int y) {
        try {
            Objects.checkIndex(arr[x][y], arr.length);
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
        return true;

    }

    public static void algorithmLi(int[][] m, int x2, int y2) {
        int w = m.length;
        int h = m[0].length;
        int count = 1;
        while (m[x2 - 1][y2 - 1] < 0) {
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    if (m[i][j] == count) {
                        if (i < (w - 1) && (m[i + 1][j] == 0 | m[i + 1][j] == -2)) {
                            m[i + 1][j] = count + 1;
                        }
                        if ((i > 0) && (m[i - 1][j] == 0 | m[i - 1][j] == -2)) {
                            m[i - 1][j] = count + 1;

                        }
                        if ((j < h - 1) && (m[i][j + 1] == 0 | m[i][j + 1] == -2)) {
                            m[i][j + 1] = count + 1;

                        }
                        if (j > 0 && (m[i][j - 1] == 0 | m[i][j - 1] == -2)) {
                            m[i][j - 1] = count + 1;

                        }
                    }
                }
            }
            count++;
        }
    }

    public static void printWay(int[][] m, int x2, int y2, int count) {
        x2 = x2 - 1;
        y2 = y2 - 1;
        while (count > 1) {
            if (x2 < m.length - 1 && m[x2 + 1][y2] == count - 1) {
                m[x2 + 1][y2] = -3;
                x2++;
                count--;
            } else if (x2 > 0 && m[x2 - 1][y2] == count - 1) {
                m[x2 - 1][y2] = -3;
                x2--;
                count--;
            } else if (y2 < m[0].length - 1 && m[x2][y2 + 1] == count - 1) {
                m[x2][y2 + 1] = -3;
                y2++;
                count--;
            } else if (y2 > 0 && m[x2][y2 - 1] == count - 1) {
                m[x2][y2 - 1] = -3;
                y2--;
                count--;
            }

        }
    }

    public static void main(String[] args) {
        int[][] map = getMap();
        int x1 = 7;
        int y1 = 1;
        int x2 = 6;
        int y2 = 8;
        start(map, x1, y1);
        end(map, x2, y2);
        pprint(map);
        System.out.println("_______");
        algorithmLi(map, x2, y2);
        printWay(map, x2, y2, map[x2 - 1][y2 - 1]);
        System.out.println("_______");
        start(map, x1, y1);
        end(map, x2, y2);
        pprint2(map);
    }
}

