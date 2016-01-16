package edu.coldserenity.tij.ch10.ex04;

import java.util.*;

/**
 * Exercise 4: (3)
 * <p/>
 * Create a generator class that produces character names (as String
 * objects) from your favorite movie (you can use Snow White or Star
 * Wars as a fallback) each time you call next( ), and loops around
 * to the beginning of the character list when it runs out of names.
 * Use this generator to fill an array, an ArrayList, a LinkedList,
 * a HashSet, a LinkedHashSet, and a TreeSet, then print each
 * container.
 */
public class ContainerPlay {
    public static void main(String[] args) {
        CharacterNameGenerator characterNameGenerator = new CharacterNameGenerator();
        ArrayList<String> arrayList = new ArrayList<String>();
        characterNameGenerator.populateCollection(7, arrayList);
        System.out.println(arrayList);

        LinkedList<String> linkedList = new LinkedList<String>();
        characterNameGenerator.populateCollection(7, linkedList);
        System.out.println(linkedList);

        HashSet<String> hashSet = new HashSet<String>();
        characterNameGenerator.populateCollection(7, hashSet);
        System.out.println(hashSet);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        characterNameGenerator.populateCollection(7, linkedHashSet);
        System.out.println(linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<String>();
        characterNameGenerator.populateCollection(7, treeSet);
        System.out.println(treeSet);


    }
}

class CharacterNameGenerator {
    private LinkedList<String> names = new LinkedList<String>();
    private Iterator<String> namesIterator;

    {
        Collections.addAll(names,
                "Leia Skywalker", "Luke Skywalker",
                "Chubakka", "Yoda", "Enakin Skywalker",
                "Darth Vader", "Han Solo", "Old Big One",
                "c3p0", "r2d2");
    }

    public String next() {
        if (namesIterator == null || !namesIterator.hasNext()) {
            namesIterator = names.iterator();
        }
        return namesIterator.next();
    }

    public void populateCollection(int numberOfNames, Collection<String> collection) {
        for (int i = 0; i < numberOfNames; i++) {
            collection.add(next());
        }
    }
}