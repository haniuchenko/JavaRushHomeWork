package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man = new Man("Boris", 24, "Hell");
        Woman woman = new Woman("Ivanka", 23, "Hell+");

        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(woman.name + " " + woman.age + " " + woman.address);

    }

    public static class Man
    {
        String name = null;
        int age;
        String address = null;

        public Man(String name)
        {
            this.name = name;
        }
        public Man(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman
    {
        String name = null;
        int age;
        String address = null;

        public Woman(String name)
        {
            this.name = name;
        }
        public Woman(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }
}
