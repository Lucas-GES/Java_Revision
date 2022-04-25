package collections;

import java.util.Objects;

public class Aula implements Comparable<Aula>{

    private String name;
    private String weekDay;
    private Integer classesPerDay;

    public Aula(){}

    public Aula(String name, String weekDay, Integer classesPerDay){
        this.name = name;
        this.weekDay = weekDay;
        this.classesPerDay = classesPerDay;
    }

    public String getName(){
        return this.name;
    }

    public String getWeekDay(){
        return this.weekDay;
    }

    public Integer getClassesPerDay(){
        return this.classesPerDay;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setWeekDay(String weekDay){
        this.weekDay = weekDay;
    }

    public void setClassesPerDay(Integer classesPerDay){
        this.classesPerDay = classesPerDay;
    }

    @Override
    public String toString(){
        return "Class name: " + name + ", Weekday: " + weekDay + ", Number of Classes: " + classesPerDay + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aula aula = (Aula) o;
        return name.equals(aula.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Aula aula) {
        return this.name.compareTo(aula.name);
    }
}
