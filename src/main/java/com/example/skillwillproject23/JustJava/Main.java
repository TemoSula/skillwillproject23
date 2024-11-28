package com.example.skillwillproject23.JustJava;

import com.example.skillwillproject23.Models.Person;
import com.example.skillwillproject23.Service.WorkWithStream;

import java.util.List;

public class Main {

    public static void main(String[] args)
    {

        List<Integer> numbersList = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        WorkWithStream.ConvertEvenNumbersToString(numbersList);


        List<Person> personList = List.of(
                new Person("giorgi",14),
                new Person("anamria",25),
                new Person("luka",20),
                new Person("nia",21),
                new Person("nika",29),
                new Person("andria",23),
                new Person("anastasia",27),
                new Person("artavazi",28),
                new Person("aluda",35),
                new Person("temo",22)
        );

        WorkWithStream.getUserNames(personList);
    }

}
