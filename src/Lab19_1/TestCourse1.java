package Lab19_1;

import java.util.Arrays;

public class TestCourse1 {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        System.out.println("Number of students in course1: " +
                course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for(int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");
        System.out.println();
        course1.dropStudent("Peter Jones");
        students = course1.getStudents();
        for(int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");


    }
}
class Course{
    private String courseName;
    private String[] students = new String[1];

    private int numberOfStudents;
    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if(numberOfStudents<students.length){
            students[numberOfStudents]=student;
            numberOfStudents++;
        }
        else{
            String[] temp = new String[students.length*2];
            for(int i=0; i<students.length; i++){
                temp[i]=students[i];
            }
            temp[numberOfStudents]=student;
            students=temp;
            numberOfStudents++;
        }


    }
    public String[] getStudents() {
        String[] getstudent = new String[numberOfStudents];
        getstudent=students;
        return getstudent;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public String getCourseName() {
        return courseName;
    }
    public void dropStudent(String student) {
        int index =0;
        String[] dropstudent = new String[numberOfStudents-1];
       for(int i=0; i<students.length; i++){
           if(student.equals(students[i])){
               index =i;
           }
       }
       numberOfStudents--;
       for(int i =0, k=0; i<=numberOfStudents; i++){
           if(i==index){
               continue;
           }
           else{
               dropstudent[k++]=students[i];
           }
       }
       this.students=dropstudent;

    }
}