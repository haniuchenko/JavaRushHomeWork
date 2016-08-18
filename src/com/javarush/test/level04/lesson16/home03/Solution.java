package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader rr = new BufferedReader(new InputStreamReader(System.in));
        int summ = 0;
        for(int j = 0; j>=0; )
        {
            j = Integer.parseInt(rr.readLine());
            summ += j;

        }
        System.out.print(summ);

    }
}
