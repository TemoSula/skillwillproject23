package com.example.skillwillproject23.Service;

import com.example.skillwillproject23.Models.Person;

import java.util.List;

public class WorkWithStream {

    public static List<String> ConvertEvenNumbersToString(List<Integer> numberList)
    {
        List<String> evenNumbers = numberList.stream().filter(x -> x % 2 == 0).map(String::valueOf).toList();
        System.out.println(evenNumbers);
        return evenNumbers;
    }

    public static List<String> getUserNames(List<Person> personList)
    {
        List<String> namesList = personList.stream().filter(x -> x.getAge() > 20).filter(x -> !x.getName().startsWith("a")).map(Person::getName).toList();
        System.out.println(namesList);
        return namesList;
    }


}
