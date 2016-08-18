package com.javarush.test.level06.lesson11.home07;

import java.util.ArrayList;

/* Три статические переменных name
Создай 3 public статических переменных: String Solution.name, String Cat.name, String Dog.name
*/

public class Solution
{
    public static String name = null;

    public Solution(String name)
    {
        Solution.name = name;
    }

    public static class Cat {

        public static String name = null;

        public Cat(String name)
        {
            Cat.name = name;
        }

    }

    public static class Dog {

        public static String name = null;

        public Dog(String name)
        {
            Dog.name = name;
        }
    }
}
