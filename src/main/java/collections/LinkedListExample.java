package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListExample {

    public static void main(String[] args) {
        Curso curso = new Curso("Java", "Bob");

        curso.addAula(new Aula("Object Oriented Programming", "Monday", 2));
        curso.addAula(new Aula("Polymorphism", "Monday", 2));
        curso.addAula(new Aula("Inheritance", "Tuesday", 2));
        System.out.println(curso);
        curso.removeAula("Object Oriented Programming");
        System.out.println(curso);

        System.out.println();
        String aula = curso.getAulas().stream()
                .filter(a -> a.getWeekDay().equals("Tuesday")).collect(Collectors.toList()).toString();
        System.out.println(aula);

        String aula1 = curso.getAulas().stream().filter(a -> a.getName().equalsIgnoreCase("polymorphism"))
                .map((Aula result) -> {
                    result.setClassesPerDay(result.getClassesPerDay() * 2);
                    return result;
                }).collect(Collectors.toList()).toString();
        System.out.println(aula1);

        String aula2 = curso.getAulas().stream().filter(a -> a.getName().equalsIgnoreCase("inheritance"))
                .map((nome) -> {
                    nome.setName("Potato");
                    return nome;
                }).collect(Collectors.toList()).toString();
        System.out.println(aula2);

    }

}
