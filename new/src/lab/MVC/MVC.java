package lab.MVC;

import java.util.Scanner;

//MVC
public class MVC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        String roll = sc.nextLine();
        String add = sc.nextLine();
        Student model = retriveStudent(name,roll,add);
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
    }
    private static Student retriveStudent(String n, String r, String a){
        Student student = new Student();
        student.setName(n);
        student.setRoll(r);
        student.setAddress(a);
        return student;
    }
}
