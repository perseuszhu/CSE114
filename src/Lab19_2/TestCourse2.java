package Lab19_2;

import java.util.ArrayList;
import java.util.Arrays;

public class TestCourse2 {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        System.out.println("Number of students in course1: " +
                course1.getNumberOfStudents());
        ArrayList<String> arrstudents = course1.getStudents();
        for(int i = 0; i <course1.getNumberOfStudents(); i++)
            System.out.print(arrstudents.get(i) + ", ");
        System.out.println();
        course1.dropStudent("Peter Jones");
        arrstudents = course1.getStudents();
        for(int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(arrstudents.get(i) + ", ");


    }
}
class Course{
    private String courseName;
    private ArrayList<String> arrstudents = new ArrayList<String>();
    private int numberOfStudents;
    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        arrstudents.add(student);
        numberOfStudents++;
        }
    public ArrayList<String> getStudents() {
        return arrstudents;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        arrstudents.remove(student);
        numberOfStudents--;
    }
    public void clear(String clear){
        arrstudents.clear();
    }
}