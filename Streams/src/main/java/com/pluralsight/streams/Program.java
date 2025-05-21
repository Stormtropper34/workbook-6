package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> people = getPeople();

        String lastName = "Sensei";
        List<Person> matchingPeople = getPeopleByLastName(people, lastName);
        printPeople(matchingPeople);

        int totalAge = 0;
        for (Person person : people) {
            //totalAge = totalAge + person.getAge();
            totalAge += person.getAge();
        }
        double avergaeAge = totalAge / people.size();
        System.out.println("Average age: " + avergaeAge);


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
