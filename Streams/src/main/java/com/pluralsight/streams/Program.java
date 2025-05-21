package com.pluralsight.streams;

import com.pluralsight.streams.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> people = getPeople();

        String lastName = "Sensei";
        List<Person> matchingPeople = getPeopleByLastName(people, lastName);
        printPeople(matchingPeople);

        double avergaeAge = getAvergaeAge(people);
        System.out.println("Average age: " + avergaeAge);

        List<Integer> ages = getAges(people);


        int oldestAge = Collections.max(ages);
        System.out.println(oldestAge);

        int youngestAge = Collections.min(ages);
        System.out.println(youngestAge);
    }

    private static List<Integer> getAges(List<Person> people) {
        List<Integer> ages = new ArrayList<>();
        for(Person person : people) {
            ages.add(person.getAge());
        }
        return ages;
    }

    private static double getAvergaeAge(List<Person> people) {
        int totalAge = 0;
        for (Person person : people) {
            //totalAge = totalAge + person.getAge();
            totalAge += person.getAge();
        }
        double avergaeAge = totalAge / people.size();
        return avergaeAge;
    }

    private static void printPeople(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    private static List<Person> getPeopleByLastName(List<Person> people, String lastName) {
        List<Person> matchingPeople = new ArrayList<>();
        for (Person person : people) {
            if(person.getLastName().equalsIgnoreCase(lastName)){
                matchingPeople.add(person);
            }
        }
        return matchingPeople;
    }

    private static List<Person> getPeople() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Eren", "Jaeger", 19));
        people.add(new Person("Mikasa", "Ackerman", 19));
        people.add(new Person("Levi", "Ackerman", 34));
        people.add(new Person("Naruto", "Uzumaki", 17));
        people.add(new Person("Sasuke", "Uchiha", 17));
        people.add(new Person("Sakura", "Haruno", 17));
        people.add(new Person("Izuku", "Midoriya", 16));
        people.add(new Person("All", "Might", 49));
        people.add(new Person("Saitama", "Sensei", 25));
        people.add(new Person("Turtle", "Sensei", 20));
        people.add(new Person("Genos", "Cyborg", 19));
        return people;
    }
}
