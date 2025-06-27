package model;

//Creating how the student object looks

public class Student {
    private String name;
    private int id;
    private int age;

    public Student(String name,int id,int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName(){ return name;}
    public int getId(){return id;}
    public int getAge(){return age;}

    @Override
    public String toString(){
        return "Name: " + name + ",ID: " + id + ",Age: " + age;
    }
}
