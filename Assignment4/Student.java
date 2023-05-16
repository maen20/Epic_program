import java.util.ArrayList;
import java.util.Collections;
import java.util.List; //implemented from interface

import static java.util.Arrays.asList;

public class Student {

    private final String name;
    private final int age;
    private final Gender gender;
    private final boolean active;
    private final List<Course> courses;
    public Student(String name, int age, Gender gender, boolean active, List<Course> courses) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.active = active;
        this.courses = courses;
    }
public static Student of(String name, int age, Gender gender, boolean active,Course...courses){
       return new Student(name,age,gender,active,asList(courses));
       //if you forgot this, read your notebook.
}
   /* this method can simplify the work for the user.
    public static Student of(String name, int age, Gender gender){
        return new Student(name,age,gender,true, Collections.emptyList());
    }*/

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public boolean isActive() {
        return active;
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses); //a primal solution as a start better than returning an arraylist
        // this syntax turn me to NOT BEING the owner of the "private final List<Course> courses;" variable
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", active=" + active +
                ", courses=" + courses +
                '}';
    }
}
//can be declared by using the datatype :enum.
// arraylist.