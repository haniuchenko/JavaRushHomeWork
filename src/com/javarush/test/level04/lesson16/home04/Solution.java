package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader rr = new BufferedReader(new InputStreamReader(System.in));
        String name = rr.readLine();
        int year = Integer.parseInt(rr.readLine());
        int month = Integer.parseInt(rr.readLine());
        int day = Integer.parseInt(rr.readLine());
        System.out.println("Меня зовут " + name );
        System.out.print("Я родился " + day + "." + month + "." + year);
    }
}
