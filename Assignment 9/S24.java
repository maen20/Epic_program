import java.rmi.StubNotFoundException;
import java.util.Optional;

public class S24 extends Exception {
    static Student[] students = new Student[]{
            Student.of(1,"maen"),
            Student.of(2,"Ali"),
            Student.of(3,"Ahmad")
    };

    public static void main(String[] args) {


        try {
            Student studentInfo=getStudentById(5);
            System.out.println("std info = " + studentInfo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            Student studentInfo2 = getStudentById2(5);
            System.out.println("std info : "+studentInfo2);
        } catch (StubNotFoundException e) {
            System.out.println( e.getMessage());
        }
        try {
            Optional<Student> studentInfo2 = getStudentById3(5);
            System.out.println("std info : "+studentInfo2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
       // return null;
        throw new RuntimeException( "id: "+id + " not found.");
    }
    public static Student getStudentById2(int id) throws StubNotFoundException {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
throw new StubNotFoundException("std with id "+ id+" doesnt not exist");
    }
    public static Optional<Student> getStudentById3(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }


}
