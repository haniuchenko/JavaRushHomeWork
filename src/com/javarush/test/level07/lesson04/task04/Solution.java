package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[10];
        for(int a = 9; a >= 0; a--)
        {
            nums[a] = Integer.parseInt(r.readLine());
        }
        for(int b = 0; b < 10; b++)
        {
            System.out.println(nums[b]);
        }
    }
}
