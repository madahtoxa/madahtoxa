import jdk.jfr.Period;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 5");
        int value = 33;
        System.out.println(value);
        value = changeValue(value);
        System.out.println(value);

        System.out.println("\nTask 6");
        Integer valueInteger = 22;
        System.out.println(valueInteger);
        valueInteger = changeValueInteger(valueInteger);
        System.out.println(valueInteger);

        System.out.println("\nTask 7");
        Integer[] integers = new Integer[]{3, 4};
        System.out.println(Arrays.toString(integers));
        integers = changeValueInteger2(integers);
        System.out.println(Arrays.toString(integers));

        System.out.println("\n\nTask 8");
        Integer[] num = new Integer[]{3, 4};
        System.out.println(Arrays.toString(num));
        changeValueInteger3(num);
        System.out.println(Arrays.toString(num));

        System.out.println("\n\nTask 9");
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println(person);
        person = changePerson(person);
        System.out.println(person);

        System.out.println("\n\nTask 10");
        person=new Person("Lyapis","Trubetskoy");
        System.out.println(person);
        changePerson2(person);
        System.out.println(person);


    }

    static int changeValue(int value) {
        value = 22;
        return value;
    }

    static Integer changeValueInteger(Integer value) {
        value = 33;
        return value;
    }

    static Integer[] changeValueInteger2(Integer[] integers) {
        integers = new Integer[]{1, 2};
        return integers;
    }

    static Integer[] changeValueInteger3(Integer[] integers) {

        integers[0] = 99;
        return integers;
    }

    static Person changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
        return person;
    }

    static Person changePerson2(Person person) {
        person.setName("Илья");
        person.setSurname("Лагутенко");
        return person;
    }
}