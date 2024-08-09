package lab.MVC;

import java.util.Scanner;

//MVC
public class MVC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        String email = sc.nextLine();
        String add = sc.nextLine();
        Employee model = retriveEmployee(name,email,add);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
    }
    private static Employee retriveEmployee(String n, String r, String a){
        Employee employee = new Employee();
        employee.setName(n);
        employee.setemail(r);
        employee.setAddress(a);
        return employee;
    }
}
