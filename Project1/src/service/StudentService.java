package service;

import model.Student;
import java.util.*;
// Services provided to the student class
public class StudentService {
    /**
     1) Add a student
     2) Remove a student
     3) Get all student details
     4) Get details of single student
     */

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents(){
        return students;
    }

    public boolean deleteStudent(int id){
        for (int i = 0; i < students.size(); i++) {
                Student s = students.get(i);
                if(s.getId()==id){
                    students.remove(i);
                    return true;
                }
        }
        return false;
    }

    public void getStudent(int id){
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if(s.getId()==id){
                System.out.println("Name: "+s.getName());
                System.out.println("ID: "+id);
                System.out.println("Age: "+s.getAge());
            }
        }
    }
}
