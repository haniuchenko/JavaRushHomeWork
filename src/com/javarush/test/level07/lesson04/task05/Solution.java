package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader rr = new BufferedReader(new InputStreamReader(System.in));
        int[] numsBig = new int[20];
        int[] numsLl1 = new int[10];
        int[] numsLl2 = new int[10];
        for(int a = 0; a < 20; a++)
        {
            numsBig[a] = Integer.parseInt(rr.readLine());
            for(int b = 0; b < 10; b++)
            {
                numsLl1[b] = numsBig[b];
            }
        }
        for(int c = 10; c < 20; c++)
        {
            numsLl2[c-10] = numsBig[c];
            System.out.println(numsLl2[c-10]);
        }

    }
}
