package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*


Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
Пример вывода на экран:
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
3 6 9 12 15 18 21 24 27 30
4 8 12 16 20 24 28 32 36 40
5 10 15 20 25 30 35 40 45 50
6 12 18 24 30 36 42 48 54 60
7 14 21 28 35 42 49 56 63 70
8 16 24 32 40 48 56 64 72 80
9 18 27 36 45 54 63 72 81 90
10 20 30 40 50 60 70 80 90 100
Требования:
1. Программа не должна считывать текст c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить таблицу умножения 10х10.
4. В программе должен использоваться цикл while.


*/

public class Main {
    public static void main(String[] args) throws Exception {
        int a = 0;

        while (a<10) {
            a++;
            line(a);
        }
    }

    public static void line (int v) {
        int v1 = v;
        System.out.print(v1 + " ");

        while (v1<(v*10)) {
            v1 += v;
            System.out.print(v1 + " ");
        }
        System.out.println();

    }
}
