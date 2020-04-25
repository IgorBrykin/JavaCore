package JavaCore.task13.task1326;

/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10


Требования:
1. Программа должна считывать данные с консоли.
2. Программа должна создавать FileInputStream для введенной с консоли строки.
3. Программа должна выводить данные на экран.
4. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
5. Программа должна закрывать поток чтения из файла(FileInputStream).
"/home/igorbanza/Downloads/Hello nigga!.txt"
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = null;
        ArrayList<Integer> integers = new ArrayList<>();

        try {
            fileInputStream = new FileInputStream(reader.readLine());
            Scanner in = new Scanner(fileInputStream, "UTF-8");
            while (in.hasNextInt()) {
                Integer next = Integer.parseInt(in.nextLine());
                if (next % 2 == 0)
                    integers.add(next);
            }
            Collections.sort(integers);
            for (Integer integer : integers) {
                System.out.println(integer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

