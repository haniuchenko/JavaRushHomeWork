package com.javarush.test.level08.lesson03.task06;

import java.util.HashMap;
import java.util.Map;

/* Коллекция HashMap из Object
Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
Sim - 5
*/

public class Solution
{

        public static void main(String[] args)
        {
            salary(700);
        }

        public static void salary(int a)
        {
            a = a + 100;
            System.out.println("Твоя зарплата составляет: " + a + " долларов в месяц.");
        }

}
