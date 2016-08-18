package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader rr = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[10];
        for(int a = 0; a < 8; a++)
        {
            strings[a] = rr.readLine();
        }
        for(int b = 9; b >= 0; b--)
        {
            System.out.println(strings[b]);
        }

    }
}