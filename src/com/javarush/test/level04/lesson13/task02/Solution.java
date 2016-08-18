package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader rr = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(rr.readLine());
        int b = Integer.parseInt(rr.readLine());
        for(int c = 1;c<=a;c++)
        {

            for (int d = 1; d <= b; d++)
            {
                System.out.print(8);
            }

            System.out.println();
        }
    }
}
