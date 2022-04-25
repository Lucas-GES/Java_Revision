package collections;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(new Aula("Math", "Monday", 2));
        aulas.add(new Aula("English", "Thursday", 2));
        aulas.add(new Aula("Chemistry", "Wednesday", 2));
        aulas.add(new Aula("Geography", "Tuesday", 2));

        Collections.sort(aulas);
        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getWeekDay));
        System.out.println(aulas);

    }
}
