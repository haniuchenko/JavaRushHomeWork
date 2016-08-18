package com.javarush.test.level07.lesson06.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader rr = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        /*for(int a = 0; a < 5; a++)
        {
            String s = rr.readLine();
            list.add(s);
        }
        */
        list.add(0, "Britva");
        list.add(1, "Britva");
        list.add(2, "Britva");
        list.add(3, "Britva");
        list.add(4, "Britva");
        System.out.println(list.size());
        for(int y = 0; y < list.size(); y++)
        {
            System.out.println(list.get(y));
        }
    }
}
