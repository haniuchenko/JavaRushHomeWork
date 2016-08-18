package com.javarush.test.level06.lesson11.home06;

/* KissMyShinyMetalAss
Создай класс с именем KissMyShinyMetalAss. Создай объект этого класса, выведи его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        KissMyShinyMetalAss bender = new KissMyShinyMetalAss("Ееееееее, стал менее тупым!");
        System.out.println(bender);
    }

    public static class KissMyShinyMetalAss
    {
        String shout;

        public KissMyShinyMetalAss(String shout)
        {
            this.shout = shout;
        }



    }

}
