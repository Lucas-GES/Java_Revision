package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {

    public static void main(String[] args) {

        List<Person> peoples = Arrays.asList(
                new Person("Charles", "Dickens", 68),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        peoples.sort(Comparator.comparing(Person::getLastName));

        peoples.forEach(p -> System.out.println(p));
        System.out.println();
        peoples.stream().filter(p -> p.getLastName().startsWith("C")).forEach(person -> System.out.println(person));

        int average = peoples.stream()
                .map(age -> age.getAge())
                .reduce(0 , (x,y) -> x + y) / peoples.size();

        double average2 = peoples.stream()
                        .mapToInt(age -> age.getAge())
                                .average().getAsDouble();

        System.out.println("Average age: " + average);
        System.out.println("Average age2: " + average2);

        System.out.println();

        peoples.stream().filter(person -> person.getName().startsWith("C"))
                .map((nome) -> {
                    nome.setName("Huckstubble");
                    return nome;
                }).collect(Collectors.toList());


        peoples.stream().forEach(person -> System.out.println(person));

    }

}
