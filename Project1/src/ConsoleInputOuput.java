// Creating a view for the controller
import controller.StudentController;
import java.util.Scanner;
public class ConsoleInputOuput {
    StudentController controller = new StudentController();
    Scanner sc = new Scanner(System.in);

    public void start(){
        while(true){
            System.out.println("Student Management");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Get all students");
            System.out.println("4. Get one student");
            System.out.println("5. To exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1 -> addStudentUI();
                case 2 -> removeStudentUI();
                case 3 -> controller.getStudents().forEach(System.out::println);
                case 4 -> getStudentUI();
                case 5 ->{
                    System.out.println("exit");
                    return;
                }
                default -> System.out.println("Choose properly");
            }
        }
    }

    private void addStudentUI() {
        sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter id: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        controller.addStudent(name,id,age);
        System.out.println("Added student");
    }

    private void removeStudentUI(){
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        boolean cond = controller.removeStudent(id);
        if(cond) System.out.println("Deleted student");
        else System.out.println("No student with id: "+id);
    }

    private void getStudentUI(){
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        controller.getStudent(id);
    }
}
