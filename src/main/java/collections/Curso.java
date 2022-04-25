package collections;

import java.util.*;

public class Curso {
    private String name;
    private String teacher;
    private List<Aula> aulas = new LinkedList<>();

    public Curso(String name, String teacher){
        this.name = name;
        this.teacher = teacher;
    }

    public String getName(){
        return this.name;
    }

    public String getTeacher(){
        return this.teacher;
    }

    public List<Aula> getAulas(){
        return Collections.unmodifiableList(this.aulas); // use Collections.unmodifiableList to return a copy of the real list, so it cannot be modified
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTeacher(String teacher){
        this.teacher = teacher;
    }

    public void addAula(Aula aula){
        this.aulas.add(aula);
    }

    public void removeAula(String nome){
        this.aulas.removeIf((e) -> e.getName().equals(nome));
    }


    @Override
    public String toString(){
        return "Curso: " + name + ", Teacher: " + teacher + ", Aulas: " + getAulas();
    }

}
