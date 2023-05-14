import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;

public class Application {

    static Student[] students = new Student[]{
            Student.of("Ahmad", 20, Gender.MALE, true, Course.MATH, Course.CHEMISTRY, Course.JAVA),
            Student.of("Mohammad", 25, Gender.MALE, true, Course.MATH, Course.JAVA),
            Student.of("ESA", 27, Gender.MALE, false, Course.MATH, Course.JAVA),
            Student.of("ESRA", 19, Gender.FEMALE, true, Course.MATH, Course.ENGLISH),
            Student.of("DANA", 40, Gender.FEMALE, true, Course.MATH, Course.ENGLISH, Course.PHYSICS),
            Student.of("RUBA", 22, Gender.FEMALE, true, Course.MATH, Course.PHYSICS)

    };

    public static void main(String[] args) {
        List<Integer> agesList = Stream.of(students)
                .map(Student::getAge)
                .sorted()
                .distinct()
                .toList();
        System.out.println("agesList = " + agesList);


        Map<Boolean, List<String>> ageCategories = Stream.of(students)
                .collect(Collectors.partitioningBy(student -> student.getAge() < 20,
                        Collectors.mapping(Student::getName, Collectors.toList())));

        List<String> below20 = ageCategories.get(true);
        List<String> aboveOrEqual20 = ageCategories.get(false);

        System.out.println("Students younger than 20: " + below20);
        System.out.println("Students 20 or older: " + aboveOrEqual20);

}

}
