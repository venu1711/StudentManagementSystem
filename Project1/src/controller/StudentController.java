package controller;

// Takes i/p from view and sends to service, takes the o/p and sends to the view
//Create an object of the service class and create methods replicating the service class

import model.Student;
import service.StudentService;

import java.util.List;

public class StudentController {
    private StudentService service = new StudentService();

    public void addStudent(String name,int id, int age){
        Student student = new Student(name,id,age);
        service.addStudent(student);
    }

    public List<Student> getStudents(){
        return service.getStudents();
    }

    public boolean removeStudent(int id){
        return service.deleteStudent(id);
    }

    public void getStudent(int id){
        service.getStudent(id);
    }
}
