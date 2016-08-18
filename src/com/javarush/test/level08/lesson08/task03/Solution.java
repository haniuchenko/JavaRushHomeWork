package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Haniuchenko", "Vlad");
        map.put("Haniuchenko2", "Vlad1");
        map.put("Haniuchenko3", "Vlad2");
        map.put("Haniuchenko4", "Vlad3");
        map.put("Haniuchenko5", "Keh");
        map.put("hanik", " Keh");
        map.put("Haniuchenko6", "Vlad12");
        map.put("Haniuchenko7", "Vlad4");
        map.put("Haniuchenko8", "Vlad5");
        map.put("Haniuchenko9", "Vlad6");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int nameCounter = 0;
        for(Map.Entry<String, String> n : map.entrySet())
        {
            if(n.getValue().equals(name)) nameCounter++;
        }
        return nameCounter;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int lnCounter = 0;
        for(Map.Entry<String, String> l : map.entrySet())
        {
            if (l.getKey().equals(lastName)) lnCounter++;
        }
        return lnCounter;

    }
}
